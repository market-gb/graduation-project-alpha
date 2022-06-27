package ru.geekbrains.main.lesson_1.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.main.lesson_1.converters.CarConverter;
import ru.geekbrains.main.lesson_1.dto.CarDto;
import ru.geekbrains.main.lesson_1.entities.Car;
import ru.geekbrains.main.lesson_1.exceptions.CarNotFoundException;
import ru.geekbrains.main.lesson_1.services.CarService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cars")
public class CarController {
    private CarService carService;
    private CarConverter carConverter;

    @GetMapping()
    public List<CarDto> getAllCars(){
        return carService.getAllCars().stream()
                .map(carConverter::carToCarDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public CarDto getCarById(@PathVariable Long id){
        Car car = carService.getCarById(id).orElseThrow(() -> new CarNotFoundException("Car not found, id: " + id));
        return carConverter.carToCarDto(car);
    }

    @PostMapping
    public CarDto saveNewCar(@RequestBody CarDto carDto){
        Car car = carConverter.carDtoToCar(carDto);
        return carConverter.carToCarDto(carService.saveCar(car));
    }

    @PutMapping
    public CarDto updateCar(@RequestBody CarDto carDto){
        Car car = carConverter.carDtoToCar(carDto);
        return carConverter.carToCarDto(carService.saveCar(car));
    }

    @DeleteMapping()
    public void deleteCar(@RequestBody CarDto carDto){
        carService.deleteCar(carConverter.carDtoToCar(carDto));
    }
}

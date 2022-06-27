package ru.geekbrains.main.lesson_1.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.geekbrains.main.lesson_1.converters.CarConverter;
import ru.geekbrains.main.lesson_1.entities.Car;
import ru.geekbrains.main.lesson_1.repositories.CarRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CarService {
    private CarRepository carRepository;
    private CarConverter carConverter;

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Optional<Car> getCarById(Long id) {
        return carRepository.findById(id);
    }

    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    public void deleteCar(Car car){
        carRepository.delete(car);
    }
}

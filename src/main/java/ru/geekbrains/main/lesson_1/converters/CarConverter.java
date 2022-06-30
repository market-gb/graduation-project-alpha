package ru.geekbrains.main.lesson_1.converters;

import org.springframework.stereotype.Component;
import ru.geekbrains.main.lesson_1.dto.CarDto;
import ru.geekbrains.main.lesson_1.entities.Car;

@Component
public class CarConverter {
    public Car carDtoToCar(CarDto carDto) {
        return new Car(carDto.getId(), carDto.getModel(), carDto.getPrice());
    }

    public CarDto carToCarDto(Car car) {
        return new CarDto(car.getId(), car.getModel(), car.getPrice());
    }
}

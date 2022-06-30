package ru.geekbrains.main.lesson_1.exceptions;

public class CarNotFoundException extends RuntimeException{
    public CarNotFoundException(String message) {
        super(message);
    }

}

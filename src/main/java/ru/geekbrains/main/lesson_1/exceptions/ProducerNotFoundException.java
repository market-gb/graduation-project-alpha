package ru.geekbrains.main.lesson_1.exceptions;

public class ProducerNotFoundException extends RuntimeException {
    public ProducerNotFoundException(String message) {
        super(message);
    }
}

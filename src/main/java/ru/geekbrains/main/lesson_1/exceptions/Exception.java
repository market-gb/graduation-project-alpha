package ru.geekbrains.main.lesson_1.exceptions;

public class Exception extends RuntimeException {
    public Exception(String message) {
        super(message);
    }

    public enum Errors{
        PRODUCT_NOT_FOUND, INVALID_PARAMS
    }
}

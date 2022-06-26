package ru.geekbrains.main.lesson_1.exceptions;

public class ResourceException extends RuntimeException{
    public ResourceException(String message) {
        super(message);
    }

    public enum Errors{
        PRODUCT_NOT_FOUND, INVALID_PARAMS
    }
}

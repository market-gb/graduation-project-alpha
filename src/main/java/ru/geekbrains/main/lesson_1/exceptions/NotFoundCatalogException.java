package ru.geekbrains.main.lesson_1.exceptions;

public class NotFoundCatalogException extends RuntimeException {
    public NotFoundCatalogException(String message) {
        super(message);
    }
}

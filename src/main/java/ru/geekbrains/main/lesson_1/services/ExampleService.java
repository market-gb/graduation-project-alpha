package ru.geekbrains.main.lesson_1.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.geekbrains.main.lesson_1.converters.ExampleConverter;
import ru.geekbrains.main.lesson_1.repositories.ExampleRepository;

@Service
@RequiredArgsConstructor
public class ExampleService {
    private final ExampleRepository exampleRepository;
    private final ExampleConverter exampleConverter;
}

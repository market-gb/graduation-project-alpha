package ru.geekbrains.main.lesson_1.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.geekbrains.main.lesson_1.entities.Category;
import ru.geekbrains.main.lesson_1.repositories.CategoryRepository;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoriesRepository;

    public Optional<Category> findById(Long id) {
        return categoriesRepository.findById(id);
    }

    public Optional<Category> findByTitle(String title) {
        return categoriesRepository.findByTitle(title);
    }
}


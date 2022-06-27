package ru.geekbrains.main.lesson_1.converters;

import ru.geekbrains.main.lesson_1.dto.CategoryDto;
import ru.geekbrains.main.lesson_1.entities.Category;

public class CategoryConverter {
    public Category categoryDtoToCategory(CategoryDto categoryDto) {
        return new Category(categoryDto.getId(), categoryDto.getTitle());
    }

    public CategoryDto categoryToCategoryDto(Category category) {
        return new CategoryDto(category.getId(), category.getTitle());
    }
}

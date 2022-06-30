package ru.geekbrains.main.lesson_1.converters;

import org.springframework.stereotype.Component;
import ru.geekbrains.main.lesson_1.dto.CategoryDto;
import ru.geekbrains.main.lesson_1.entities.Category;

@Component
public class CategoryConverter {
    public Category dtoToEntity(CategoryDto categoryDto) {
        return new Category(categoryDto.getId(), categoryDto.getTitle());
    }

    public CategoryDto entityToDto(Category category) {
        return new CategoryDto(category.getId(), category.getTitle());
    }
}

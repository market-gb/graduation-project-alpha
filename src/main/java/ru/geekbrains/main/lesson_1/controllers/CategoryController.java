package ru.geekbrains.main.lesson_1.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.main.lesson_1.converters.CategoryConverter;
import ru.geekbrains.main.lesson_1.dto.CategoryDto;
import ru.geekbrains.main.lesson_1.exceptions.ResourceException;
import ru.geekbrains.main.lesson_1.services.CategoryService;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategoryController {
    public final CategoryService categoryService;
    public final CategoryConverter categoryConverter;


    @GetMapping("/{id}")
    public CategoryDto findById(@PathVariable Long id){
        return categoryConverter.entityToDto(categoryService.findById(id)
                .orElseThrow(()-> new ResourceException("Category with id = " + id + " was not found")));
    }

    @GetMapping
    public CategoryDto findByTitle(@RequestParam String title){
        return categoryConverter.entityToDto(categoryService.findByTitle(title)
                .orElseThrow(()-> new ResourceException("Category with title = " + title + " was not found")));
    }
}

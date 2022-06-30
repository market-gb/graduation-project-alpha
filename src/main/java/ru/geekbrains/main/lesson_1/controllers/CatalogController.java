package ru.geekbrains.main.lesson_1.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.main.lesson_1.dto.CatalogDto;
import ru.geekbrains.main.lesson_1.services.CatalogService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/catalog")
public class CatalogController {

    private final CatalogService catalogService;

    @GetMapping
    public List<CatalogDto> findAll () {
        return catalogService.findAll();
    }

    @GetMapping ("/{id}")
    public CatalogDto findById (@PathVariable Long id) {
        return catalogService.findById(id);
    }

    @PostMapping
    public CatalogDto create (@RequestBody CatalogDto catalogDto) {
        return catalogService.create(catalogDto);
    }

    @PutMapping
    public CatalogDto update (@RequestBody CatalogDto catalogDto) {
        return catalogService.update(catalogDto);
    }

    @DeleteMapping ("/{id}")
    public void delete (@PathVariable Long id) {
        catalogService.delete(id);
    }

}

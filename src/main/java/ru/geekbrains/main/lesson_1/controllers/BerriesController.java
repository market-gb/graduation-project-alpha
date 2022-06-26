package ru.geekbrains.main.lesson_1.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.main.lesson_1.converters.BerriesConverter;
import ru.geekbrains.main.lesson_1.dto.BerriesDto;
import ru.geekbrains.main.lesson_1.entities.Berries;
import ru.geekbrains.main.lesson_1.services.BerriesService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/berries")
public class BerriesController {
    private final BerriesService berriesService;
    private final BerriesConverter berriesConverter;

    @GetMapping("/{id}")
    public BerriesDto getBerriesById(@PathVariable Long id) throws Exception {
        Berries berries = berriesService.findById(id).orElseThrow(() -> new Exception("Product not found, id: " + id));
        return berriesConverter.entityToDto(berries);
    }

    @GetMapping
    public List<Berries> getAllBerry(){return berriesService.findAll();}

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        berriesService.deleteById(id);
    }

    @PutMapping
    public BerriesDto updateBerries(@RequestBody BerriesDto berriesDto) throws Exception {
        Berries berries = berriesService.update(berriesDto);
        return berriesConverter.entityToDto(berries);
    }

    @PostMapping
    public BerriesDto saveNewBerries(@RequestBody BerriesDto berriesDto) {
        Berries berries = berriesConverter.dtoToEntity(berriesDto);
        berries = berriesService.save(berries);
        return berriesConverter.entityToDto(berries);
    }

}

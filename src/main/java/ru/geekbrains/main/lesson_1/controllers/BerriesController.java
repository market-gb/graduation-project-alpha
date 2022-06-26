package ru.geekbrains.main.lesson_1.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.geekbrains.main.lesson_1.converters.BerriesConverter;
import ru.geekbrains.main.lesson_1.dto.BerriesDto;
import ru.geekbrains.main.lesson_1.entities.Berries;
import ru.geekbrains.main.lesson_1.services.BerriesService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/berries")
public class BerriesController {
    private final BerriesService berriesService;
    private final BerriesConverter berriesConverter;

//    public BerriesController(BerriesService berriesService){
//        this.berriesService = berriesService;
//    }
    @GetMapping("/{id}")
    public BerriesDto getBerriesById(@PathVariable Long id) throws Exception {
        Berries berries = berriesService.findById(id).orElseThrow(() -> new Exception("Product not found, id: " + id));
        return berriesConverter.entityToDto(berries);
    }

}

package ru.geekbrains.main.lesson_1.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.main.lesson_1.dto.ProducerDto;
import ru.geekbrains.main.lesson_1.dto.ProductDto;
import ru.geekbrains.main.lesson_1.exceptions.ResourceException;
import ru.geekbrains.main.lesson_1.services.ProducerService;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/producers") //Поставщики
public class ProducerController {
    private final ProducerService service;

    @GetMapping()
    public List<ProducerDto> getProducerList(){
        return service.getProducers();
    }

    @GetMapping("/{id}")
    public ProducerDto getProducerById(@PathVariable Long id){
        return service.getProducerById(id);
    }

    @PostMapping()
    public void addProducer(@RequestBody ProducerDto dto) {
        service.addProducer(dto);
    }

    @PutMapping()
    public void changeProducer(@RequestBody ProducerDto dto) {
        service.changeProducer(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteProducer(@PathVariable Long id) {
        service.deleteProducer(id);
    }

}

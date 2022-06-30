package ru.geekbrains.main.lesson_1.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.main.lesson_1.dto.PersonDto;
import ru.geekbrains.main.lesson_1.services.PersonService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/Persons")
public class PersonController {
    private final PersonService PersonService;

    @GetMapping("/all")
    public List<PersonDto> getProductList() {
        return PersonService.getAllPersons();
    }

    @GetMapping("/{id}")
    public PersonDto getProductById(@PathVariable Long id) {
        return PersonService.getPersonById(id);
    }

    @PostMapping
    public void savePerson(@RequestBody PersonDto PersonDto) {
        PersonService.savePerson(PersonDto);
    }

    @PutMapping
    public void updatePerson(@RequestBody PersonDto PersonDto) {
        PersonService.savePerson(PersonDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deletePersonById(@PathVariable Long id) {
        PersonService.deletePersonById(id);
    }
}

package ru.geekbrains.main.lesson_1.services;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.geekbrains.main.lesson_1.converters.PersonConverter;
import ru.geekbrains.main.lesson_1.dto.PersonDto;
import ru.geekbrains.main.lesson_1.exceptions.ResourceException;
import ru.geekbrains.main.lesson_1.repositories.PersonRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository PersonRepository;
    private final PersonConverter PersonConverter;

    public List<PersonDto> getAllPersons() {
        return PersonRepository.findAll().stream()
                .map(PersonConverter::entityToDto)
                .toList();
    }

    public PersonDto getPersonById(@NonNull Long id) {
        return PersonConverter
                .entityToDto(PersonRepository.findById(id)
                        .orElseThrow(() -> new ResourceException("Person not found")));
    }

    public void savePerson(@NonNull PersonDto PersonDto) {
        PersonRepository.save(PersonConverter.dtoToEntity(PersonDto));
    }

    public void deletePersonById(@NonNull Long id) {
        PersonRepository.deleteById(id);
    }
}

package ru.geekbrains.main.lesson_1.converters;

import org.springframework.stereotype.Component;
import ru.geekbrains.main.lesson_1.dto.PersonDto;
import ru.geekbrains.main.lesson_1.entities.Person;

@Component
public class PersonConverter {
    public Person dtoToEntity(PersonDto PersonDto) {
        return new Person(PersonDto.getId(), PersonDto.getFirstName(), PersonDto.getLastName(), PersonDto.getEmail());
    }

    public PersonDto entityToDto(Person Person) {
        return new PersonDto(Person.getId(), Person.getFirstName(), Person.getLastName(), Person.getEmail());
    }
}

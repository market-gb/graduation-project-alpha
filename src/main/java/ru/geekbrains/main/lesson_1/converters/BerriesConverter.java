package ru.geekbrains.main.lesson_1.converters;

import org.springframework.stereotype.Component;
import ru.geekbrains.main.lesson_1.dto.ExampleEntityDto;
import ru.geekbrains.main.lesson_1.entities.Berries;

@Component
public class BerriesConverter {
    public Berries dtoToEntity(ExampleEntityDto exampleEntityDtoDto) {
        return new Berries(exampleEntityDtoDto.getId(), exampleEntityDtoDto.getTitle(), exampleEntityDtoDto.getPrice());
    }

    public ExampleEntityDto entityToDto(Berries berries) {
        return new ExampleEntityDto(berries.getId(), berries.getTitle(), berries.getPrice());
    }
}

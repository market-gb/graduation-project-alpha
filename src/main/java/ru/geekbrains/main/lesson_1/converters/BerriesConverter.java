package ru.geekbrains.main.lesson_1.converters;

import org.springframework.stereotype.Component;
import ru.geekbrains.main.lesson_1.dto.BerriesDto;
import ru.geekbrains.main.lesson_1.entities.Berries;

@Component
public class BerriesConverter {
    public Berries dtoToEntity(BerriesDto berriesDtoDto) {
        return new Berries(berriesDtoDto.getId(), berriesDtoDto.getTitle(), berriesDtoDto.getPrice());
    }

    public BerriesDto entityToDto(Berries berries) {
        return new BerriesDto(berries.getId(), berries.getTitle(), berries.getPrice());
    }
}

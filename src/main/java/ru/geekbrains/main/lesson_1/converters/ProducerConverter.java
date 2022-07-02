package ru.geekbrains.main.lesson_1.converters;

import org.springframework.stereotype.Service;
import ru.geekbrains.main.lesson_1.dto.ProducerDto;
import ru.geekbrains.main.lesson_1.entities.Producer;

@Service
public class ProducerConverter {
    public ProducerDto getProducerDtoFromEntity(Producer producer) {
        return new ProducerDto(producer.getId(), producer.getTitle(), producer.getAddress());
    }

    public Producer getEntityFromProducerDto(ProducerDto dto) {
        return new Producer(dto.getId(), dto.getTitle(), dto.getAddress());
    }
}

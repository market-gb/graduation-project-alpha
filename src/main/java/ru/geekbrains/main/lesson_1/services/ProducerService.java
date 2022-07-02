package ru.geekbrains.main.lesson_1.services;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.main.lesson_1.converters.ProducerConverter;
import ru.geekbrains.main.lesson_1.dto.ProducerDto;
import ru.geekbrains.main.lesson_1.dto.ProductDto;
import ru.geekbrains.main.lesson_1.entities.Producer;
import ru.geekbrains.main.lesson_1.exceptions.ProducerNotFoundException;
import ru.geekbrains.main.lesson_1.exceptions.ResourceException;
import ru.geekbrains.main.lesson_1.repositories.ProducerRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProducerService {
    private ProducerRepository repository;
    private ProducerConverter converter;

    public List<ProducerDto> getProducers() {
        return repository.findAll().stream()
                .map(p -> converter.getProducerDtoFromEntity(p))
                .collect(Collectors.toList());
    }

    public ProducerDto getProducerById(Long id) {
        Producer producer = findById(id);
        return converter.getProducerDtoFromEntity(producer);
    }

    private Producer findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ProducerNotFoundException(String.format("Producer with id %d not found", id)));
    }

    public void addProducer(ProducerDto dto) {
        Producer producer = converter.getEntityFromProducerDto(dto);
        repository.save(producer);
    }

    @Transactional
    public void changeProducer(ProducerDto dto) {
        Producer producer = findById(dto.getId());
        producer = converter.getEntityFromProducerDto(dto);
    }

    @Transactional
    public void deleteProducer(Long id) {
        Producer producer = findById(id);
        repository.deleteById(id);
    }
}


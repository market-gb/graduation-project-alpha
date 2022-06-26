package ru.geekbrains.main.lesson_1.services;

import lombok.RequiredArgsConstructor;
import ru.geekbrains.main.lesson_1.converters.BerriesConverter;
import ru.geekbrains.main.lesson_1.dao.BerriesRepository;
import ru.geekbrains.main.lesson_1.entities.Berries;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class BerriesService {
    private final BerriesRepository berriesRepository;
    private final BerriesConverter berriesConverter;

    public Optional<Berries> findById(Long id) {
        return berriesRepository.findById(id);
    }
    public void deleteById(Long id) {
        berriesRepository.deleteById(id);
    }

    public Berries save(Berries berries) {
        return berriesRepository.save(berries);
    }

    public List<Berries> findAll() {
        return berriesRepository.findAll();
    }
}

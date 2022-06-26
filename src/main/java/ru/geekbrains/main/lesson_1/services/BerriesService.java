package ru.geekbrains.main.lesson_1.services;

import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import ru.geekbrains.main.lesson_1.converters.BerriesConverter;
import ru.geekbrains.main.lesson_1.dao.BerriesRepository;
import ru.geekbrains.main.lesson_1.dto.BerriesDto;
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

    @Transactional
    public Berries update(BerriesDto berriesDto) throws Exception {
        Berries product = berriesRepository.findById(berriesDto.getId()).orElseThrow(() -> new Exception("Невозможно обновить продукта, не найден в базе, id: " + berriesDto.getId()));
        product.setPrice(berriesDto.getPrice());
        product.setTitle(berriesDto.getTitle());
        return product;
    }

    public List<Berries> findAll() {
        return berriesRepository.findAll();
    }
}

package ru.geekbrains.main.lesson_1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.geekbrains.main.lesson_1.entities.Producer;

public interface ProducerRepository extends JpaRepository<Producer, Long> {
}

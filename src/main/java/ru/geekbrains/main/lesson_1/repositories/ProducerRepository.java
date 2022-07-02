package ru.geekbrains.main.lesson_1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.main.lesson_1.entities.Producer;
@Repository
public interface ProducerRepository extends JpaRepository<Producer, Long> {
}

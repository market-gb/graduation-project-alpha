package ru.geekbrains.main.lesson_1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.geekbrains.main.lesson_1.entities.Berries;

@org.springframework.stereotype.Repository
public interface BerriesRepository extends JpaRepository<Berries, Long> {
}

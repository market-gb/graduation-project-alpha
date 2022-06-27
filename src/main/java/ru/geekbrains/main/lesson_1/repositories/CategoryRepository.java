package ru.geekbrains.main.lesson_1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.main.lesson_1.entities.Category;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository <Category, Long> {
    Optional<Category> findByTitle(String title);
}

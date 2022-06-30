package ru.geekbrains.main.lesson_1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.main.lesson_1.entities.CatalogEntity;

import java.util.Optional;

@Repository
public interface CatalogRepository extends JpaRepository<CatalogEntity, Long> {
    Optional<CatalogEntity> findById(Long id);
}

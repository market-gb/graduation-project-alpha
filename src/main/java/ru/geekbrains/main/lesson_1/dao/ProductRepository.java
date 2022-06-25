package ru.geekbrains.main.lesson_1.dao;

import ru.geekbrains.main.lesson_1.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}

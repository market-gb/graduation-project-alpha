package ru.geekbrains.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.main.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}

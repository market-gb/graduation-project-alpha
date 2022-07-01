package ru.geekbrains.main.lesson_1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.main.lesson_1.entities.MarketUser;

import java.util.Optional;

@Repository
public interface MarketUserRepository extends JpaRepository<MarketUser, Long> {

    Optional<MarketUser> findByLogin(String login);
}

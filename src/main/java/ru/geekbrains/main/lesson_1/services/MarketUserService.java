package ru.geekbrains.main.lesson_1.services;

import org.springframework.stereotype.Service;
import ru.geekbrains.main.lesson_1.entities.MarketUser;
import ru.geekbrains.main.lesson_1.repositories.MarketUserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MarketUserService {
    private final MarketUserRepository marketUserRepository;

    public MarketUserService(MarketUserRepository marketUserRepository) {
        this.marketUserRepository = marketUserRepository;
    }

    public void save(MarketUser marketUser) {
        marketUserRepository.save(marketUser);
    }

    public Optional<MarketUser> findById(Long id) {
        return marketUserRepository.findById(id);
    }

    public Optional<MarketUser> findByLogin(String login) {return marketUserRepository.findByLogin(login);}

    public void deleteById(Long id) {
        marketUserRepository.deleteById(id);
    }

    public List<MarketUser> findAll() {
        return marketUserRepository.findAll();
    }
}

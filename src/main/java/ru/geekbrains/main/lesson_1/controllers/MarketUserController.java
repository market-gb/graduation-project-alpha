package ru.geekbrains.main.lesson_1.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.geekbrains.main.lesson_1.converters.MarketUserMapper;
import ru.geekbrains.main.lesson_1.dto.MarketUserDto;
import ru.geekbrains.main.lesson_1.entities.MarketUser;
import ru.geekbrains.main.lesson_1.services.MarketUserService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/market_users")
public class MarketUserController {

    private final MarketUserService marketUserService;
    private final MarketUserMapper marketUserMapper;

    public MarketUserController(MarketUserService marketUserService,
                                MarketUserMapper marketUserMapper) {
        this.marketUserService = marketUserService;
        this.marketUserMapper = marketUserMapper;
    }

    @GetMapping
    public List<MarketUser> findAll () {
        return marketUserService.findAll();
    }

    @GetMapping("/login/{login}")
    public MarketUserDto findByLogin (@PathVariable String login) {
        return marketUserMapper.MapToMarketUserDto(marketUserService.findByLogin(login).orElse(null));
    }

    @GetMapping ("/{id}")
    public MarketUserDto findById (@Valid @PathVariable Long id) {
       return marketUserMapper.MapToMarketUserDto(marketUserService.findById(id).orElse(null));
    }

    @PostMapping
    public void add (@Valid @RequestBody MarketUserDto marketUserDto) {
        marketUserService.save(marketUserMapper.MapToMarketUser(marketUserDto));
    }

    @PutMapping
    public void update (@Valid @RequestBody MarketUser marketUser) {
        marketUserService.save(marketUser);
    }

    @DeleteMapping("/{id}")
    public void delete (@Valid @PathVariable Long id) {
        marketUserService.deleteById(id);
    }
}

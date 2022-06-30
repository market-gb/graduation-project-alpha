package ru.geekbrains.main.lesson_1.converters;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.geekbrains.main.lesson_1.dto.MarketUserDto;
import ru.geekbrains.main.lesson_1.entities.MarketUser;

@Mapper(
        injectionStrategy = InjectionStrategy.CONSTRUCTOR,
        componentModel = "spring"
)
public abstract class MarketUserMapper {

    @Mapping(source = "login", target = "login")
    public abstract MarketUser MapToMarketUser(MarketUserDto marketUserDto);

    @Mapping(source = "login", target = "login")
    public abstract MarketUserDto MapToMarketUserDto(MarketUser marketUser);

}

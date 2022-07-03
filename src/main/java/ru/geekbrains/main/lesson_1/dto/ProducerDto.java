package ru.geekbrains.main.lesson_1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class ProducerDto {
    Long id;
    String title;
    String address;
}

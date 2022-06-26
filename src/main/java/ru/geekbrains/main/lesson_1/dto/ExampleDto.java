package ru.geekbrains.main.lesson_1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExampleDto implements Serializable {

    private Long id;
    private String firstName;
    private String lastName;
}

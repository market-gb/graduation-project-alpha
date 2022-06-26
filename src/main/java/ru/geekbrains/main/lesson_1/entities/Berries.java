package ru.geekbrains.main.lesson_1.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@javax.persistence.Entity
@Table(name = "berries")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Berries {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "price")
    private BigDecimal price;
}

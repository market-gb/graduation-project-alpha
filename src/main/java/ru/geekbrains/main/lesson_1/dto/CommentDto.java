package ru.geekbrains.main.lesson_1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentDto {

    private Long id;
    private String text;
    private String authorName;
    private LocalDateTime createdAt;

}

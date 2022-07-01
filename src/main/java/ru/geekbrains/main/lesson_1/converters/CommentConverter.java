package ru.geekbrains.main.lesson_1.converters;

import org.springframework.stereotype.Component;
import ru.geekbrains.main.lesson_1.dto.CommentDto;
import ru.geekbrains.main.lesson_1.entities.Comment;

@Component
public class CommentConverter {
    public Comment dtoToEntity(CommentDto commentDto) {
        return new Comment(commentDto.getText(), commentDto.getAuthorName());
    }

    public CommentDto entityToDto(Comment comment) {
        return new CommentDto(comment.getId(),
                comment.getText(),
                comment.getAuthorName(),
                comment.getCreatedAt());
    }
}

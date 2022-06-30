package ru.geekbrains.main.lesson_1.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.main.lesson_1.converters.CommentConverter;
import ru.geekbrains.main.lesson_1.dto.CommentDto;
import ru.geekbrains.main.lesson_1.exceptions.ResourceException;
import ru.geekbrains.main.lesson_1.services.CommentService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/conmment")
@RequiredArgsConstructor
public class CommentController {

    private final CommentConverter commentConverter;
    private final CommentService commentService;

    @GetMapping("/{id}")
    public CommentDto findById(@PathVariable Long id) {
        return commentConverter.entityToDto(commentService.findById(id)
                .orElseThrow(() -> new ResourceException("Comment with id=" + id + " not found")));
    }

    @GetMapping("/allcomments")
    public List<CommentDto> getCommentsListByAuthorName(@RequestParam(name="author") String authorName){
        return commentService.findByAuthorName(authorName)
                .stream()
                .map(commentConverter::entityToDto)
                .collect(Collectors.toList());
    }
}

package ru.geekbrains.main.lesson_1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.geekbrains.main.lesson_1.entities.Comment;
import ru.geekbrains.main.lesson_1.repositories.CommentRepository;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CommentService {
    private final CommentRepository commentRepository;

    @Autowired
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public Optional<Comment> findById(Long id) {
        return commentRepository.findById(id);
    }

    public ArrayList<Comment> findByAuthorName(String authorName) {
        return commentRepository.findByAuthorName(authorName);
    }
}

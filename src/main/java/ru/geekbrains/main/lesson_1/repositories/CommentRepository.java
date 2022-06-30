package ru.geekbrains.main.lesson_1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.main.lesson_1.entities.Comment;

import java.util.ArrayList;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    ArrayList<Comment> findByAuthorName(String authorName);
}

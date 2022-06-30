package ru.geekbrains.main.lesson_1.entities;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="comments")
@Data
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "text")
    private String text;

    @Column(name = "author_name")
    private String authorName;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;
}

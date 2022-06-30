package ru.geekbrains.main.lesson_1.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="comments")
@Data
@NoArgsConstructor
@AllArgsConstructor
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

    public Comment(String text, String authorName) {
        this.text = text;
        this.authorName = authorName;
    }
}

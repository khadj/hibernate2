package com.example.hibernate2;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "film_text")
@Getter
@Setter
public class FilmText {
    @Id
    @Column(name = "film_id")
    private Short id;

    @OneToOne
    @JoinColumn(name = "film_id")
    private Film film;

    private String title;
    @Column(columnDefinition = "text")
    @Type(type = "text")
    private String description;

}
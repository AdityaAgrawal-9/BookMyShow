package com.example.bookmyshow.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Entity(name = "movies")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Movie extends BaseModel {
    private String name;
    private String language;
    @Column(nullable = true)
    private Double rating;
    private int duration;
    private String category;
}

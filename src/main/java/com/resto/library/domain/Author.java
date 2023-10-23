package com.resto.library.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
// mark this class as database entity 
@Entity
// specify which table in database this class will be mapped to 
@Table(name = "authors")
public class Author {
    // specify the primary key 
    @Id
    // specify the sequence generation (auto increment)
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "author_id_seq"
    )
    private Long id;
    private String name;
    private Integer age;
}
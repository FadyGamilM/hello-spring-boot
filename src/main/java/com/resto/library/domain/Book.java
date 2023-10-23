package com.resto.library.domain;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="books")
public class Book {
    @Id
    // a design decision is that we want to provide this isbn each time we create a new record    
    private String isbn;
    private String title;

    // ==> before JPA
    // private Long authorId;

    // ==> after JPA we can use the entity type itself 
    // this author has many book 
    // this book has one author 
    // [sql] : put the pk of the 1-side as fk in the n-side
    // [jpa] : put the ManyToOne on top of the fk of the 1-side fk 
    @ManyToOne(
        cascade = CascadeType.ALL
    )
    @JoinColumn(name = "author_id")
    private Author author;
}
package com.resto.library.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.resto.library.domain.Author;

@Repository
public interface AuthorRepo extends CrudRepository<Author, Long>{
    
}
package com.resto.library.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.resto.library.domain.Book;

@Repository
public interface BookRepo extends CrudRepository<Book, String>{
    
}
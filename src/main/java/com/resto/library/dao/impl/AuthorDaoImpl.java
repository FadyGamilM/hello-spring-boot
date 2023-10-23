package com.resto.library.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.resto.library.dao.AuthoDao;
import com.resto.library.domain.Author;

public class AuthorDaoImpl implements AuthoDao{
        // this will be injected via the spring boot (autho wiring)
    private final JdbcTemplate jdbcTempl;
    public AuthorDaoImpl(final JdbcTemplate jdbc) {
        this.jdbcTempl = jdbc;
    }
    @Override
    public void create(Author author) {
        this.jdbcTempl.update(
            "INSERT INTO authors (name, age) VALUES (?, ?)", author.getName(), author.getAge());
    }   
    
}
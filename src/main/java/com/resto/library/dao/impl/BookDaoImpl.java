package com.resto.library.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.resto.library.dao.BookDao;

// ==> the dao implementation needs the jdbc templates to query the database tables .. and we configured this jdbc instance in our application context previously 
public class BookDaoImpl implements BookDao{
    // this will be injected via the spring boot (autho wiring)
    private final JdbcTemplate jdbcTempl;
    public BookDaoImpl(final JdbcTemplate jdbc) {
        this.jdbcTempl = jdbc;
    }   
}
package com.dionysun.graphqlkickstart.service;

import com.dionysun.graphqlkickstart.dao.BookRepository;
import com.dionysun.graphqlkickstart.dto.BookDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

}

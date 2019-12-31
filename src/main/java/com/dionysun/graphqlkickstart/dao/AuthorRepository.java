package com.dionysun.graphqlkickstart.dao;

import com.dionysun.graphqlkickstart.entity.Author;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuthorRepository extends MongoRepository<Author, String> {
    Author findAuthorById(String id);
}

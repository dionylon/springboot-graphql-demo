package com.dionysun.graphqlkickstart.dao;

import com.dionysun.graphqlkickstart.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {

}

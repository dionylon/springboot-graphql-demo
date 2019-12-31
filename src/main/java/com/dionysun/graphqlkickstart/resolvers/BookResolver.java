package com.dionysun.graphqlkickstart.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.dionysun.graphqlkickstart.dao.AuthorRepository;
import com.dionysun.graphqlkickstart.dao.BookRepository;
import com.dionysun.graphqlkickstart.dto.BookDto;
import com.dionysun.graphqlkickstart.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Component
public class BookResolver implements GraphQLMutationResolver, GraphQLQueryResolver {
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public BookResolver(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    @Transactional
    public BookDto addBook(String id, String name, String authorId){
        if(authorRepository.existsById(authorId)){
            bookRepository.save(new Book(id,name,authorId));
            return new BookDto(id,name,authorRepository.findAuthorById(authorId));
        }
        return null;
    }

    public BookDto book(String id) {
        Optional<Book> optional = bookRepository.findById(id);
        if(optional.isPresent()){
            Book book = optional.get();
            return new BookDto(book.getId(),book.getName(),authorRepository.findAuthorById(book.getAuthorId()));
        }
        return null;
    }
}

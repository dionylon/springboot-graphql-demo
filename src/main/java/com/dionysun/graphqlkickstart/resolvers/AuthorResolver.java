package com.dionysun.graphqlkickstart.resolvers;


import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.dionysun.graphqlkickstart.dao.AuthorRepository;
import com.dionysun.graphqlkickstart.entity.Author;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class AuthorResolver implements GraphQLQueryResolver, GraphQLMutationResolver {
    private final AuthorRepository authorRepository;

    public AuthorResolver(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Transactional
    public Author addAuthor(String id, String name) {
        if(!authorRepository.existsById(id)){
            return authorRepository.save(new Author(id,name));
        }
        return null;
    }
    public List<Author> authors(){
        return authorRepository.findAll();
    }
}

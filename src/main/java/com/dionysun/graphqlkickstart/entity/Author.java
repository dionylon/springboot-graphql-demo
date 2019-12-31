package com.dionysun.graphqlkickstart.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document("authors")
@AllArgsConstructor
public class Author {
    @Id
    private String id;
    @Field("name")
    private String name;
}

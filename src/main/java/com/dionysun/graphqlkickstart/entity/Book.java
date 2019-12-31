package com.dionysun.graphqlkickstart.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document("books")
@AllArgsConstructor
public class Book {
    @Id
    private String id;
    @Field("name")
    private String name;
    @Field("authorId")
    private String authorId;

}

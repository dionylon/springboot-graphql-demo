package com.dionysun.graphqlkickstart.dto;

import com.dionysun.graphqlkickstart.entity.Author;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookDto {
    private String id;
    private String name;
    private Author author;
}

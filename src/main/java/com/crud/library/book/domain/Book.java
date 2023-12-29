package com.crud.library.book.domain;

import com.crud.library.bookCopy.domain.BookCopy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "books")
public class Book {

    @Id
    @GeneratedValue
    @Column(unique = true)
    private Long bookId;
    private String title;
    private String author;
    private int yearOfPublication;

}

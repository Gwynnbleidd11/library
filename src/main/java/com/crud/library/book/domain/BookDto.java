package com.crud.library.book.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BookDto {

    private final Long bookId;
    private final String title;
    private final String author;
    private final int yearOfPublication;
}

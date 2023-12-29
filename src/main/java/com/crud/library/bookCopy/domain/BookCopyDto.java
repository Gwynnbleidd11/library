package com.crud.library.bookCopy.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BookCopyDto {

    private Long copyId;
    private Long bookId;
    private BookCopyStatus status;
}

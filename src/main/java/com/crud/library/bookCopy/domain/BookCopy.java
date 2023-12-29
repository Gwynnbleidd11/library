package com.crud.library.bookCopy.domain;

import com.crud.library.book.domain.Book;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "copies")
public class BookCopy {

    @Id
    @GeneratedValue
    @Column(unique = true)
    private Long copyId;
    private Long bookId;
    private BookCopyStatus status;

}

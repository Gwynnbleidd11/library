package com.crud.library.bookCopy.service;

import com.crud.library.bookCopy.domain.BookCopy;
import com.crud.library.bookCopy.repository.BookCopyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookCopyService {

    private final BookCopyRepository bookCopyRepository;

    public BookCopy addBookCopy(final BookCopy bookCopy) {
        return bookCopyRepository.save(bookCopy);
    }

    public List<BookCopy> getBookCopies(final Long bookId) {
        return bookCopyRepository.findByBookId(bookId);
    }


}

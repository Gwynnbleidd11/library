package com.crud.library.book.mapper;

import com.crud.library.book.domain.Book;
import com.crud.library.book.domain.BookDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookMapper {

    public Book mapToBook(final BookDto bookDto) {
        return new Book(bookDto.getBookId(), bookDto.getTitle(), bookDto.getAuthor(), bookDto.getYearOfPublication());
    }

    public BookDto mapToBookDto(final Book book) {
        return new BookDto(book.getBookId(), book.getTitle(), book.getAuthor(), book.getYearOfPublication());
    }

    public List<BookDto> mapToBookDtoList(final List<Book> bookList) {
        return bookList.stream()
                .map(this::mapToBookDto)
                .toList();
    }
}

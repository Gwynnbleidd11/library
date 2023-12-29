package com.crud.library.book.controller;

import com.crud.library.book.domain.*;
import com.crud.library.book.mapper.BookMapper;
import com.crud.library.book.service.BookService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
@CrossOrigin("*")
public class BookController {

    private final BookService bookService;
    private final BookMapper bookMapper;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addBook(@RequestBody BookDto bookDto) {
        Book book = bookMapper.mapToBook(bookDto);
        bookService.addBook(book);
        return ResponseEntity.ok().build();
    }

    @GetMapping("{bookId}")
    public ResponseEntity<BookDto> getBook(@PathVariable Long bookId) throws BookNotFoundException {
        return ResponseEntity.ok(bookMapper.mapToBookDto(bookService.getBook(bookId)));
    }

    @GetMapping
    public ResponseEntity<List<BookDto>> getAllBooks () {
        List<Book> booksList = bookService.getAllBooks();
        return ResponseEntity.ok(bookMapper.mapToBookDtoList(booksList));
    }

    @PutMapping
    public ResponseEntity<BookDto> updateBook(@RequestBody BookDto bookDto) {
        Book book = bookMapper.mapToBook(bookDto);
        Book savedBook = bookService.addBook(book);
        return ResponseEntity.ok(bookMapper.mapToBookDto(savedBook));
    }
}

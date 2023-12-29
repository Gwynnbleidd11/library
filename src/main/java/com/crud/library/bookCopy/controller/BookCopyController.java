package com.crud.library.bookCopy.controller;

import com.crud.library.bookCopy.domain.BookCopy;
import com.crud.library.bookCopy.domain.BookCopyDto;
import com.crud.library.bookCopy.mapper.BookCopyMapper;
import com.crud.library.bookCopy.service.BookCopyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookCopies")
@RequiredArgsConstructor
@CrossOrigin("*")
public class BookCopyController {

    private final BookCopyService bookCopyService;
    private final BookCopyMapper bookCopyMapper;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> addBookCopy(@RequestBody BookCopyDto bookCopyDto) {
        BookCopy bookCopy = bookCopyMapper.mapToBookCopy(bookCopyDto);
        bookCopyService.addBookCopy(bookCopy);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<BookCopyDto> updateBookCopyStatus(@RequestBody BookCopyDto bookCopyDto) {
        BookCopy bookCopy = bookCopyMapper.mapToBookCopy(bookCopyDto);
        BookCopy savedBookCopy = bookCopyService.addBookCopy(bookCopy);
        return ResponseEntity.ok(bookCopyMapper.mapToBookCopyDto(savedBookCopy));
    }

    @GetMapping
    public ResponseEntity<List<BookCopyDto>> getBookCopies(Long bookId) {
        List<BookCopy> booksCopies = bookCopyService.getBookCopies(bookId);
        return ResponseEntity.ok(bookCopyMapper.mapToBookCopyDtoList(booksCopies));
    }
}

package com.crud.library.bookCopy.mapper;

import com.crud.library.bookCopy.domain.BookCopy;
import com.crud.library.bookCopy.domain.BookCopyDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookCopyMapper {

    public BookCopy mapToBookCopy(final BookCopyDto bookCopyDto) {
        return new BookCopy(bookCopyDto.getCopyId(), bookCopyDto.getBookId(), bookCopyDto.getStatus());
    }

    public BookCopyDto mapToBookCopyDto(final BookCopy bookCopy) {
        return new BookCopyDto(bookCopy.getCopyId(), bookCopy.getBookId(), bookCopy.getStatus());
    }

    public List<BookCopyDto> mapToBookCopyDtoList(final List<BookCopy> bookCopiesList) {
        return bookCopiesList.stream()
                .map(this::mapToBookCopyDto)
                .toList();
    }
}

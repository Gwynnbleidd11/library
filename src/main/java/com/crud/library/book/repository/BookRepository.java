package com.crud.library.book.repository;

import com.crud.library.book.domain.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends CrudRepository<Book, Long> {

    @Override
    Book save(Book book);

    Optional<Book> findById(Long id);

    @Override
    List<Book> findAll();
}

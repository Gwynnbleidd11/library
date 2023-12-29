package com.crud.library.bookCopy.repository;

import com.crud.library.bookCopy.domain.BookCopy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookCopyRepository extends CrudRepository<BookCopy, Long> {

    @Override
    BookCopy save(BookCopy bookCopy);

    List<BookCopy> findByBookId(Long id);

}

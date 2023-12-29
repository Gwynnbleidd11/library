package com.crud.library.mock;

import com.crud.library.book.service.BookService;
import com.crud.library.bookCopy.service.BookCopyService;
import com.crud.library.user.domain.User;
import com.crud.library.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MockService {
    private final UserService userService;
    private final BookService bookService;
    private final BookCopyService bookCopyService;

//    public void createDatabase() {
//        createUser();
//    }

//    private void createUser() {
//        userService.saveUser(
//                User.builder()
//                        .name()
//                        .lastname()
//                        .creationDate()
//                        .build()
//        );
//        userService.saveUser(
//                User.builder()
//                        .name()
//                        .lastname()
//                        .creationDate()
//                        .build()
//        );
//        userService.saveUser(
//                User.builder()
//                        .name()
//                        .lastname()
//                        .creationDate()
//                        .build()
//        );
//        userService.saveUser(
//                User.builder()
//                        .name()
//                        .lastname()
//                        .creationDate()
//                        .build()
//        );
//
//    }
}

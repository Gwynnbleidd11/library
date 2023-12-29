package com.crud.library.mock;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mock")
@RequiredArgsConstructor
public class MockController {

    private final MockService mockService;

//    @PostMapping()
//    public void mock() {
//        mockService.createDatabase();
//    }

}

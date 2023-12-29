package com.crud.library.rent.controller;

import com.crud.library.rent.mapper.RentMapper;
import com.crud.library.rent.domain.Rent;
import com.crud.library.rent.domain.RentDto;
import com.crud.library.rent.service.RentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rentals")
@RequiredArgsConstructor
@CrossOrigin("*")
public class RentController {

    private final RentService rentService;
    private final RentMapper rentMapper;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> rentBookCopy(@RequestBody RentDto rentDto) {
        Rent rent = rentMapper.mapToRent(rentDto);
        rentService.rentBook(rent);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    public ResponseEntity<RentDto> returnBook(@RequestBody RentDto rentDto) {
        Rent rent = rentMapper.mapToRent(rentDto);
        Rent rentedBook = rentService.rentBook(rent);
        return ResponseEntity.ok(rentMapper.mapToRentDto(rentedBook));
    }

}

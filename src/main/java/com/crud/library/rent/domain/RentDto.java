package com.crud.library.rent.domain;

import com.crud.library.user.domain.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class RentDto {

    private Long rentId;
    private Long copyId;
    private Long userId;
    private LocalDate rentDate;
    private LocalDate returnDate;
}

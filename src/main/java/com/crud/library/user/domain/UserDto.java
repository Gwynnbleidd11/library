package com.crud.library.user.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;


@Builder
public record UserDto(
        Long userId,
        String name,
        String lastname,
        LocalDate creationDate) {
}

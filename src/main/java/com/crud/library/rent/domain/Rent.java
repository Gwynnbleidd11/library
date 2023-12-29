package com.crud.library.rent.domain;

import com.crud.library.user.domain.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "rentals")
public class Rent {

    @Id
    @GeneratedValue
    @Column(unique = true)
    private Long rentId;
    private Long copyId;
    private Long userId;
    private LocalDate rentDate;
    private LocalDate returnDate;
}

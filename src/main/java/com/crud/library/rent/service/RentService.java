package com.crud.library.rent.service;

import com.crud.library.rent.repository.RentRepository;
import com.crud.library.rent.domain.Rent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RentService {

    private final RentRepository rentRepository;

    public Rent rentBook(final Rent rent) {
        return rentRepository.save(rent);
    }
}

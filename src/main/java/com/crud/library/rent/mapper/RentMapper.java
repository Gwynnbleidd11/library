package com.crud.library.rent.mapper;

import com.crud.library.rent.domain.Rent;
import com.crud.library.rent.domain.RentDto;
import org.springframework.stereotype.Service;

@Service
public class RentMapper {

    public Rent mapToRent(final RentDto rentDto) {
        return new Rent(rentDto.getRentId(), rentDto.getCopyId(), rentDto.getUserId(), rentDto.getRentDate(), rentDto.getReturnDate());
    }

    public RentDto mapToRentDto(final Rent rent) {
        return new RentDto(rent.getRentId(), rent.getCopyId(), rent.getUserId(), rent.getRentDate(), rent.getReturnDate());
    }
}

package com.crud.library.rent.repository;

import com.crud.library.rent.domain.Rent;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentRepository extends CrudRepository<Rent, Long> {

    @Override
    Rent save(Rent rent);
}

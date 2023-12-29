package com.crud.library.user.repository;

import com.crud.library.user.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    @Override
    Optional<User> findById(Long userId);

    @Override
    List<User> findAll();

    @Override
    void deleteById(Long userId);

    @Override
    User save(User user);

    List<User> save(List<User> usersList);
}

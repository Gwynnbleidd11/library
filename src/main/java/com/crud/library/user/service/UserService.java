package com.crud.library.user.service;

import com.crud.library.user.controller.UserNotFoundException;
import com.crud.library.user.domain.User;
import com.crud.library.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User getUser(final Long userId) throws UserNotFoundException {
        return userRepository.findById(userId).orElseThrow(UserNotFoundException::new);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void deleteUser(final Long userId) {
        userRepository.deleteById(userId);
    }

    public User saveUser(final User user) {
        return userRepository.save(user);
    }

    public List<User> saveUsersList(List<User> usersList) {
        return userRepository.save(usersList);
    }
}

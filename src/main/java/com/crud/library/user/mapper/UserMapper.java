package com.crud.library.user.mapper;

import com.crud.library.user.domain.User;
import com.crud.library.user.domain.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserMapper {

    public User mapToUser(final UserDto userDto) {
        return new User(userDto.userId(), userDto.name(), userDto.lastname(), userDto.creationDate());
    }

    public UserDto mapToUserDto(final User user) {
        return UserDto.builder()
                .userId(user.getUserId())
                .name(user.getName())
                .lastname(user.getLastname())
                .creationDate(user.getCreationDate())
                .build();
    }

    public List<UserDto> mapToUserDtoList(final List<User> usersList) {
        return usersList.stream()
                .map(this:: mapToUserDto)
                .toList();
    }

    public List<User> mapToUsersList(final List<UserDto> userDtoList) {
        return userDtoList.stream()
                .map(this::mapToUser)
                .toList();
    }
}

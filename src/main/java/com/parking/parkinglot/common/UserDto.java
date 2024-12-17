package com.parking.parkinglot.common;

import com.parking.parkinglot.entities.Car;
import com.parking.parkinglot.entities.User;

import java.util.List;
import java.util.stream.Collectors;

public class UserDto {
    Long id;
    String username;
    String email;

    public UserDto(Long id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public static List<UserDto> copyUsersToDto(List<User> users) {
        return users.stream()
                .map(user -> new UserDto(
                        user.getId(),
                        user.getUsername(),
                        user.getEmail()
                ))
                .collect(Collectors.toList());
    }
}

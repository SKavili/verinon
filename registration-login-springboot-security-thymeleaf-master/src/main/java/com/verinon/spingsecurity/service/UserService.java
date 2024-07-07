package com.verinon.spingsecurity.service;

import java.util.List;

import com.verinon.spingsecurity.dto.UserDto;
import com.verinon.spingsecurity.entity.User;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}

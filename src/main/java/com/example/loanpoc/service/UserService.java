package com.example.loanpoc.service;

import com.example.loanpoc.entity.User;

import java.util.List;

public interface UserService {
    String saveUser(User user);

    List<User> getAllUsers();
}

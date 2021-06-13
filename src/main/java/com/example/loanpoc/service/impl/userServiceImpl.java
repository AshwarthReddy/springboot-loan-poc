package com.example.loanpoc.service.impl;

import com.example.loanpoc.entity.User;
import com.example.loanpoc.repo.UserRepo;
import com.example.loanpoc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public String saveUser(User user) {

        Integer userId = userRepo.save(user).getUserId();
        return "user created successfully, your userID is : " + userId;

    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

}

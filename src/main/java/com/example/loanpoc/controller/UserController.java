package com.example.loanpoc.controller;


import com.example.loanpoc.entity.User;
import com.example.loanpoc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping
    private ResponseEntity<String> crateNewUser(@RequestBody User user) {
        String response = userService.saveUser(user);
        return ResponseEntity.ok().body(response);
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers(){
        return ResponseEntity.ok().body(userService.getAllUsers());
    }
}

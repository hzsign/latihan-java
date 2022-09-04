package com.belajar.postes.controllers;

import com.belajar.postes.models.User;
import com.belajar.postes.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/user")

public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getAllUser(){
        List<User> users = userService.getAll();

        return  new ResponseEntity<>(users, HttpStatus.OK);
    }
}

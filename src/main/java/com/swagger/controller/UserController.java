package com.swagger.controller;

import com.swagger.model.User;
import com.swagger.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController implements UserControllerApi {

    private final UserService userService;
    @Override
    public ResponseEntity<List<User>> getUsers () {
        return ResponseEntity.ok(userService.getUsers(10));
    }

    @Override
    public ResponseEntity<User> getUserDetail (String id) {
        return ResponseEntity.ok(userService.getUserDetail("123456"));
    }
}

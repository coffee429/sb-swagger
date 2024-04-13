package com.swagger.controller;

import com.swagger.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("/api/v1/user")
public interface UserControllerApi {

    @GetMapping()
    ResponseEntity<List<User>> getUsers ();

    @GetMapping("/details")
    ResponseEntity<User> getUserDetail (@RequestParam String id);
}

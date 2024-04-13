package com.swagger.service;

import com.swagger.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    public List<User> getUsers (int total) {
        List<User> users = new ArrayList<>();
        for (int i = 0; i <= total; i++) {
            User newUser = User.builder()
                               .id(generateRandomString())
                               .firstName(generateRandomString())
                               .lastName(generateRandomString())
                               .build();

            users.add(newUser);
        }
        return users;
    }

    private String generateRandomString () {
        String uuid = UUID.randomUUID()
                          .toString()
                          .replace("-",
                                   "");
        return uuid;
    }

    public User getUserDetail (String id) {
        return User.builder()
                   .id(generateRandomString())
                   .firstName(generateRandomString())
                   .lastName(generateRandomString())
                   .build();
    }
}

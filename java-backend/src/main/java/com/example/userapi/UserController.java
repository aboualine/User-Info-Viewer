package com.example.userapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @CrossOrigin(origins = "*") // Allow CORS (for dev)
    @GetMapping("/users")
    public List<Map<String, String>> getUsers() {
        List<Map<String, String>> users = new ArrayList<>();

        Map<String, String> user1 = new HashMap<>();
        user1.put("name", "Alice");
        user1.put("email", "alice@example.com");

        Map<String, String> user2 = new HashMap<>();
        user2.put("name", "Bob");
        user2.put("email", "bob@example.com");

        users.add(user1);
        users.add(user2);

        return users;
    }
    @RestController
    @RequestMapping("/users")
    @CrossOrigin(origins = "*")
    public class UserController {

        @Autowired
        private UserDAO userDAO;

        @GetMapping
        public List<User> getUsers() {
            return userDAO.getAllUsers();
        }
    }

}

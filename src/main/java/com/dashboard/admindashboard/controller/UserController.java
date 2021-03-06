package com.dashboard.admindashboard.controller;

import com.dashboard.admindashboard.entity.User;
import com.dashboard.admindashboard.error.UserNotFoundException;
import com.dashboard.admindashboard.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@CrossOrigin
@RestController
@RequestMapping("api/")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService service) {
        userService = service;
    }

    @PostMapping("addUser")
    public UUID addUser(@Valid @RequestBody User user) {
        return userService.addPerson(user);
    }

    @GetMapping("users")
    public List<User> getAllUser() {
        return userService.getAllUsers();
    }

    @GetMapping("users/{id}")
    public User getUser(@PathVariable UUID id) throws UserNotFoundException {
        return userService.getUser(id);
    }

    @DeleteMapping("users/{id}")
    public boolean deleteUser(@PathVariable UUID id) {
        return userService.deleteUser(id);
    }

    @PutMapping("users/{id}")
    public int updateUser(@PathVariable UUID id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }
}

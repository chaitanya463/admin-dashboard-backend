package com.dashboard.admindashboard.dao;

import com.dashboard.admindashboard.entity.User;
import com.dashboard.admindashboard.error.UserNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UsersRepositoty {
    UUID addUser(UUID id, User user);
    default UUID addUser(User user) {
        UUID id = UUID.randomUUID();
        return addUser(id, user);
    }
    boolean deleteUser(UUID id);

    int updateUser(UUID id, User user);

    List<User> getAllUsers();

    Optional<User> getUser(UUID id);
}

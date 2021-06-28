package com.dashboard.admindashboard.dao;

import com.dashboard.admindashboard.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface UsersRepositoty{
    UUID addUser(UUID id, User user);
    default UUID addUser(User user) {
        UUID id = UUID.randomUUID();
        return addUser(id, user);
    }
    int deleteUser(UUID id);

    int updateUser(UUID id, User user);

    List<User> getAllUsers();

    User getUser(UUID id);
}

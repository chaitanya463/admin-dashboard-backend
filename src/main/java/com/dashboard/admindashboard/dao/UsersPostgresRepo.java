package com.dashboard.admindashboard.dao;

import com.dashboard.admindashboard.entity.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("postgres")
public class UsersPostgresRepo implements UsersRepositoty{

    @Override
    public UUID addUser(UUID id, User user) {
        return null;
    }

    @Override
    public boolean deleteUser(UUID id) {
        return false;
    }

    @Override
    public int updateUser(UUID id, User user) {
        return 0;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public Optional<User> getUser(UUID id) {
        return Optional.empty();
    }
}

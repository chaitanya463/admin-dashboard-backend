package com.dashboard.admindashboard.service;

import com.dashboard.admindashboard.dao.UsersRepositoty;
import com.dashboard.admindashboard.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private UsersRepositoty repositoty;
    @Autowired
    public UserService(@Qualifier("listrepo") UsersRepositoty usersRepositoty) {
        this.repositoty = usersRepositoty;
    }

    public UUID addPerson(User user) {
        return repositoty.addUser(user);
    }

    public List<User> getAllUsers() {
        return repositoty.getAllUsers();
    }

    public User getUser(UUID id) {
        return repositoty.getUser(id);
    }
}

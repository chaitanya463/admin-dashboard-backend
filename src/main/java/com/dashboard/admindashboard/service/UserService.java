package com.dashboard.admindashboard.service;

import com.dashboard.admindashboard.dao.UsersRepositoty;
import com.dashboard.admindashboard.entity.User;
import com.dashboard.admindashboard.error.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    private UsersRepositoty repositoty;
    @Autowired
    public UserService(@Qualifier("listrepo") UsersRepositoty usersRepositoty) {
        this.repositoty = usersRepositoty;
    }

    public UUID addPerson(User user) {
        UUID id = UUID.randomUUID();
        user.setId(id);
        return repositoty.addUser(user);
    }

    public List<User> getAllUsers() {
        return repositoty.getAllUsers();
    }

    public User getUser(UUID id) throws UserNotFoundException {
        Optional<User> user = repositoty.getUser(id);
        if (!user.isPresent()) {
            throw new UserNotFoundException("User not found");
        }

        return user.get();
    }

    public boolean deleteUser(UUID id) {
        return  repositoty.deleteUser(id);
    }

    public int updateUser(UUID id, User user) {
        return repositoty.updateUser(id, user);
    }
}

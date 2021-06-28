package com.dashboard.admindashboard.dao;

import com.dashboard.admindashboard.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("listrepo")
public class UserLisrRepositoryImplementation implements  UsersRepositoty{
    private static List<User> list = new ArrayList<>();
    @Override
    public UUID addUser(UUID id, User user) {
       list.add(new User(id, user.getUserName(), user.getFullName(), user.getEmail(), user.getPassword(), user.getPhoneNum(), user.getAddress(), user.getGender()));
       return id;
    }

    @Override
    public int deleteUser(UUID id) {
        return 1;
    }

    @Override
    public int updateUser(UUID id, User user) {
        return 0;
    }

    @Override
    public List<User> getAllUsers() {
        return list;
    }

    @Override
    public User getUser(UUID id) {
        return (User)list.stream().filter(user -> user.getId() == id);
    }
}

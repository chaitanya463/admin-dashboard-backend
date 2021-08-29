package com.dashboard.admindashboard.dao;

import com.dashboard.admindashboard.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("listrepo")
public class UserLisrRepositoryImplementation{
//    private final Logger logger = LoggerFactory.getLogger(UserLisrRepositoryImplementation.class);
//    private static List<User> list = new ArrayList<>();
//    @Override
//    public UUID addUser(UUID id, User user) {
//       list.add(new User(id, user.getUserName(), user.getFullName(), user.getEmail(), user.getPassword(), user.getPhoneNum(), user.getAddress(), user.getGender(), user.getDesignation()));
//       return id;
//    }
//
//    @Override
//    public boolean deleteUser(UUID id) {
//        Optional<User> user = getUser(id);
//        if (user.isPresent()) {
//            return list.remove(user.get());
//        }
//        return false;
//    }
//
//    @Override
//    public int updateUser(UUID id, User newUser) {
//        Optional<User> user = getUser(id);
//        int index = list.indexOf(user.get());
//        if (user.isPresent()) {
//            list.set(index, new User(id, newUser.getUserName(), newUser.getFullName(), newUser.getEmail(), newUser.getPassword(), newUser.getPhoneNum(), newUser.getAddress(), newUser.getGender(), newUser.getDesignation()));
//            return 1;
//        }
//        return 0;
//    }
//
//    @Override
//    public List<User> getAllUsers() {
//        return list;
//    }
//
//    @Override
//    public Optional<User> getUser(UUID id) {
//        return list.stream().filter(user -> user.getId().equals(id)).findFirst();
//    }
}

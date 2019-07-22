package com.kirilo.springMVC.services;

import com.kirilo.springMVC.models.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserService {
    private List<User> users = new ArrayList<>();

    public UserService() {
        users.add(new User("user", "password"));
    }

    public String checkUser(User user) {
        /*if (user.getName() != null && user.getName().equals("user") && user.getPassword() != null && user.getPassword().equals("password")) {
            return "success";
        } else {
            return "failed";
        }*/
        return users.contains(user) ? "success" : "failed";
    }

    public String createUser(User user) {
        return users.contains(user) ? "exist" : users.add(user) ? "success" : "failed";
    }
}

package com.kirilo.springMVC.services;

import com.kirilo.springMVC.models.User;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    public String checkUser(User user) {
        if (user.getName() != null && user.getName().equals("user") && user.getPassword() != null && user.getPassword().equals("password")) {
            return "success";
        } else {
            return "failed";
        }
    }
}

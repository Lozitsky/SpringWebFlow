package com.kirilo.springMVC.services;

import com.kirilo.springMVC.exceptions.UserExistException;
import com.kirilo.springMVC.models.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.stereotype.Component;
import org.springframework.webflow.execution.RequestContext;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);
    private List<User> users = new ArrayList<>();

    public UserService() {
        users.add(new User("user", "password"));
    }

    public String checkUser(User user, RequestContext context) throws UserExistException{
        /*if (user.getName() != null && user.getName().equals("user") && user.getPassword() != null && user.getPassword().equals("password")) {
            return "success";
        } else {
            return "failed";
        }*/

        logger.info(context.getFlowScope().asMap().toString());

//        return users.contains(user) ? "success" : "failed";

        if (!users.contains(user)) {
            context.getMessageContext().addMessage(new MessageBuilder().code("check_user").build());
            return "failed";
//            throw new UserExistException("User Failed!");
        } else {
            context.getMessageContext().addMessage(new MessageBuilder().code("user_exist").build());
        }

        return "success";
    }

    public boolean userExist(User user, RequestContext context) {
        logger.info(context.getFlowScope().asMap().toString());

        return users.contains(user);
    }

    public String createUser(User user, RequestContext context) throws UserExistException {
//        return users.contains(user) ? "exist" : users.add(user) ? "success" : "failed";
        if (!users.contains(user)) {
            users.add(user);
            context.getMessageContext().addMessage(new MessageBuilder().code("created_user").build());
        } else {
            context.getMessageContext().addMessage(new MessageBuilder().code("user_exist").build());
//            throw new UserExistException("User Exist!");
        }

        context.getMessageContext().addMessage(new MessageBuilder().code("enter").build());

        return "success";
    }
}

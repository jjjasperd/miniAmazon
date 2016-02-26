package com.minia.controller;

import com.minia.entity.User;
import com.minia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by duanyujia on 2/24/16.
 */
@Controller
@RequestMapping("/spring")
public class MainController {

    @Autowired
    private UserService userService;

    @RequestMapping("")
    public String home(){
        List<User> us = new ArrayList<User>();
        User u = new User();
        u.setUsername("MarK");
        us.add(u);
        u = new User();
        u.setUsername("Fawofolo");
        us.add(u);
        userService.saveUsers(us);
        return "index";
    }

    @RequestMapping("/json")
    @ResponseBody
    public List<User> json(){
        return userService.getAllUsernames();
    }
}


package com.loskut.controller;

import com.loskut.model.User;
import com.loskut.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by RAYANT on 12.01.2016.
 */

@Controller
public class Main {

    @Autowired
    private  UserService userService;

    @RequestMapping("/")
    public String main(ModelMap model) {
        List<User> users = userService.listAll();
        model.addAttribute("users", users);
        return "index";
    }
}

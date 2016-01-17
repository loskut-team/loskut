package com.loskut.controller;

import com.loskut.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by RAYANT on 14.01.2016.
 */
@Controller
public class LoginController {



    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String main() {
        return "login";
    }


}

package com.loskut.controller;

import com.loskut.dao.interfaces.UserDao;
import com.loskut.model.User;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by RAYANT on 12.01.2016.
 */

@Controller
@Transactional
public class Main {

    @Autowired
    private UserDao userDao;


    @RequestMapping(value = {"/","/index"})
       public String main(ModelMap model) {
        List<User> users = userDao.listAll();
        Hibernate.initialize(users);
        System.out.println("users: "+users);
        model.addAttribute("users", users);
        return "index";
    }
}

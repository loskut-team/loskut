package com.loskut.controller;

import com.loskut.model.Cloth;
import com.loskut.service.interfaces.ClothService;
import com.loskut.service.interfaces.OrderService;
import com.loskut.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by RAYANT on 17.01.2016.
 */

@Controller
public class AdminController {

    @Autowired
    private UserService userService;

    @Autowired
    private ClothService clothService;


    @Autowired
    private OrderService orderService;

    @RequestMapping("/admin")
    public String main(ModelMap model) {
        List<Cloth> clothList = clothService.listAll();
        model.addAttribute("clothList", clothList);
        return "admin";
    }


    @RequestMapping(value = "/add-cloth",method = RequestMethod.POST)
    public String addCloth(){

        return "redirect:admin";
    }
}

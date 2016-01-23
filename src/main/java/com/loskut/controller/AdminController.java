package com.loskut.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.loskut.model.Cloth;
import com.loskut.service.filters.ClothFilter;
import com.loskut.service.interfaces.ClothService;
import com.loskut.service.interfaces.OrderService;
import com.loskut.service.interfaces.UserService;
import com.loskut.util.EntityPage;
import jdk.nashorn.internal.ir.debug.JSONWriter;
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
    public String main(ModelMap model) throws JsonProcessingException {

        List<Cloth> clothList = clothService.listAll();
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(clothList);


//        String json = gson.toJson(clothList);



        model.addAttribute("clothList", json);
        return "admin";
    }

    @RequestMapping("/test")
    public String test(ModelMap model) {
        try {
            ClothFilter clothFilter = new ClothFilter();
            clothFilter.setFirstResult(5);
            clothFilter.setMaxResults(10);
            EntityPage<Cloth> clothList = clothService.listAllWithFilter(clothFilter);
            System.out.println(clothList);
            model.addAttribute("clothList", clothList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "test";
    }


    @RequestMapping(value = "/add-cloth",method = RequestMethod.POST)
    public String addCloth(){

        return "redirect:admin";
    }
}

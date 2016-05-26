package com.loskut.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.loskut.dao.interfaces.ClothDao;
import com.loskut.model.Cloth;
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

//    @Autowired
//    private UserService userService;

    @Autowired
    private ClothDao clothDao;

//    @Autowired
//    private OrderService orderService;

    @RequestMapping("/admin-cloth")
    public String getClothPage(ModelMap model) throws JsonProcessingException {

        List<Cloth> clothList = clothDao.listAll();
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(clothList);
//        String json = gson.toJson(clothList);
        model.addAttribute("clothList", json);
        return "admin/admin-cloth";
    }


    @RequestMapping("/admin-customers")
    public String getCustomersPage(ModelMap model) throws JsonProcessingException {

//        List<Cloth> clothList = clothDao.listAll();
//        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
//        String json = ow.writeValueAsString(clothList);
////        String json = gson.toJson(clothList);
//        model.addAttribute("clothList", json);
        return "admin/admin-customers";
    }




    @RequestMapping("/test")
    public String test() {
        return "test";
    }


    @RequestMapping(value = "/add-cloth",method = RequestMethod.POST)
    public String addCloth(){

        return "redirect:admin";
    }
}

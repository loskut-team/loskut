package com.loskut.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by RAYANT on 19.01.2016.
 */
@Controller
public class TrashController {

    @RequestMapping("/about")
    public String about(ModelMap model) {
        return "about";
    }

    @RequestMapping("/blog-home-1")
    public String blogHome1(ModelMap model) {
        return "blog-home-1";
    }

    @RequestMapping("/blog-home-2")
    public String blogHome2(ModelMap model) {
        return "/blog-home-2";
    }


    @RequestMapping("/blog-post")
    public String blogPost(ModelMap model) {
        return "/blog-post";
    }

    @RequestMapping("/contact")
    public String contact(ModelMap model) {
        return "contact";
    }

    @RequestMapping("/faq")
    public String faq(ModelMap model) {
        return "faq";
    }

    @RequestMapping("/full-width")
    public String fullWidth(ModelMap model) {
        return "full-width";
    }

    @RequestMapping("/portfolio-1-col")
    public String portfolio1col(ModelMap model) {
        return "portfolio-1-col";
    }

    @RequestMapping("/portfolio-2-col")
    public String portfolio2col(ModelMap model) {
        return "portfolio-2-col";
    }

    @RequestMapping("/portfolio-3-col")
    public String portfolio3col(ModelMap model) {
        return "portfolio-3-col";
    }

    @RequestMapping("/portfolio-4-col")
    public String portfolio4col(ModelMap model) {
        return "portfolio-4-col";
    }

    @RequestMapping("/portfolio-item")
    public String portfolioItem(ModelMap model) {
        return "portfolio-item";
    }

    @RequestMapping("/pricing")
    public String pricing(ModelMap model) {
        return "pricing";
    }

    @RequestMapping("/services")
    public String services(ModelMap model) {
        return "services";
    }

    @RequestMapping("/sidebar")
    public String sidebar(ModelMap model) {
        return "sidebar";
    }

    @RequestMapping("/404")
    public String error(ModelMap model) {
        return "404";
    }

}

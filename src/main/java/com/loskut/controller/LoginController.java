package com.loskut.controller;

import com.loskut.dao.interfaces.UserDao;
import com.loskut.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by RAYANT on 14.01.2016.
 */
@Controller
public class LoginController {

    @Autowired
    private UserDao userDao;

    @RequestMapping("/login")
    public String main() {
        return "login";
    }



    @RequestMapping(value = "/registration", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> registration(@RequestBody User registrationForm) {
        if (registrationForm.getLogin() == null || registrationForm.getLogin().isEmpty()) {
            return new ResponseEntity<String>("login is empty", HttpStatus.FORBIDDEN);
        }
        if (registrationForm.getEmail() == null || registrationForm.getEmail().isEmpty()) {
            return new ResponseEntity<String>("email is empty", HttpStatus.FORBIDDEN);
        }
        if (registrationForm.getPassword() == null || registrationForm.getPassword().isEmpty()) {
            return new ResponseEntity<String>("password is empty", HttpStatus.FORBIDDEN);
        }
        User user = userDao.findUserByLogin(registrationForm.getLogin());
        if (user != null) {
            return new ResponseEntity<String>(String.format("User with login = %s exist", registrationForm.getLogin()), HttpStatus.FORBIDDEN);
        }
        user = userDao.findUserByEmail(registrationForm.getEmail());
        if (user != null) {
            return new ResponseEntity<String>(String.format("User with email = %s exist", registrationForm.getEmail()), HttpStatus.FORBIDDEN);
        }
        userDao.save(registrationForm);
        return new ResponseEntity<String>("registered", HttpStatus.OK);
    }

    @RequestMapping(value = "/registration/check", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> check(@RequestParam(value = "email",required = false)String email,
                                        @RequestParam(value = "login",required = false)String login){
        if(email!=null && userDao.findUserByEmail(email)!=null)return new ResponseEntity<String>("found", HttpStatus.FOUND);
        if(login!=null && userDao.findUserByLogin(login)!=null)return new ResponseEntity<String>("found", HttpStatus.FOUND);
        return new ResponseEntity<String>("free", HttpStatus.OK);
    }

}

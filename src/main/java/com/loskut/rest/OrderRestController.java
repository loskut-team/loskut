package com.loskut.rest;

import com.loskut.service.interfaces.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Optical Illusion on 25.02.2016.
 */

@RestController
public class OrderRestController {

    @Autowired
    OrderService orderService;
}

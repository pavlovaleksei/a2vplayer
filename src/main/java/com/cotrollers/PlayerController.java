package com.cotrollers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class PlayerController {


    @RequestMapping("/")
    public String index() {
        System.out.println("test");
        return "index";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test2() {
        System.out.println("test");
        return "test from back";
    }

}

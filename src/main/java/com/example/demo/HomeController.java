package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public  String index(){
        return "index";
    }

    @RequestMapping("/2")
    public  String About(){
        return "About";
    }

    @RequestMapping("/3")
    public  String ContactUs(){
        return "ContactUs";
    }

}



package com.joshayoung.springbootdependencyinjection.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello() {
        System.out.println("printed from controller");

        return "returned from controller";
    }
}

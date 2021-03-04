package com.joshayoung.springbootdependencyinjection.controllers;

import com.joshayoung.springbootdependencyinjection.services.GreetingService;
import com.joshayoung.springbootdependencyinjection.services.SetterInjectedGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}

package com.joshayoung.springbootdependencyinjection.controllers;

import com.joshayoung.springbootdependencyinjection.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}

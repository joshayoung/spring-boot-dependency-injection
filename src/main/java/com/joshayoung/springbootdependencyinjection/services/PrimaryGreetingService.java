package com.joshayoung.springbootdependencyinjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

// The qualify will override the primary, but when we do not have a qualifier it will use the primary:
@Primary
@Service
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - from primry BEAN";
    }
}

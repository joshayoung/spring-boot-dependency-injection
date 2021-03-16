package com.joshayoung.springbootdependencyinjection.services;

public class I18nSpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola - ES \n";
    }
}

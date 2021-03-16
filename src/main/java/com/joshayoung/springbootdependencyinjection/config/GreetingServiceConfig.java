package com.joshayoung.springbootdependencyinjection.config;

import com.joshayoung.springbootdependencyinjection.services.ConstructorGreetingService;
import com.joshayoung.springbootdependencyinjection.services.PropertyInjectedGreetingService;
import com.joshayoung.springbootdependencyinjection.services.SetterInjectedGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig {

    @Bean
    ConstructorGreetingService constructorGreetingService() {
        return new ConstructorGreetingService();
    }

    // It uses the name of the method as the name of the Bean:
    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService() {
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService() {
        return new SetterInjectedGreetingService();
    }
}

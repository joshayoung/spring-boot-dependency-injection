package com.joshayoung.springbootdependencyinjection.config;

import co.springframework.pets.PetService;
import co.springframework.pets.PetServiceFactory;
import com.joshayoung.springbootdependencyinjection.repositories.EnglishGreetingRepository;
import com.joshayoung.springbootdependencyinjection.repositories.EnglishGreetingRepositoryImpl;
import com.joshayoung.springbootdependencyinjection.services.*;
import org.springframework.context.annotation.*;

@ImportResource("classpath:springbootdependencyinjection-config.xml")
@Configuration
public class GreetingServiceConfig {

    @Profile({"dog", "default"})
    @Bean
    PetService dogPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("dog");
    }

    @Profile("cat")
    @Bean
    PetService catPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("cat");
    }

    @Bean
    PetServiceFactory petServiceFactory() {
        return new PetServiceFactory();
    }

    @Profile({"ES", "default"})
    // By default Spring will use the method name unless you override it:
    @Bean("i18nService")
    I18nSpanishGreetingService i18nSpanishGreetingService() {
        return new I18nSpanishGreetingService();
    }

    @Bean
    EnglishGreetingRepository englishGreetingRepository() {
        return new EnglishGreetingRepositoryImpl();
    }

    @Profile("EN")
    @Bean
    I18nEnglishGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository) {
        return new I18nEnglishGreetingService(englishGreetingRepository);
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
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

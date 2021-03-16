package com.joshayoung.springbootdependencyinjection.services;

import com.joshayoung.springbootdependencyinjection.repositories.EnglishGreetingRepository;

public class I18nEnglishGreetingService implements GreetingService {

    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hello - EN \n";
    }
}

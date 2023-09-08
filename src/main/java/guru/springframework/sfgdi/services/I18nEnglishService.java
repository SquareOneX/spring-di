package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.repositories.EnglishGreetingRepository;

public class I18nEnglishService implements GreetingService{
    private final EnglishGreetingRepository greetingRepository;

    public I18nEnglishService(EnglishGreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGreeting();
    }
}

package guru.springframework.sfgdi.services;

public class I18nGermanService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hallo Welt! - Deutsch";
    }
}

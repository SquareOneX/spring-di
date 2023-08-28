package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("de")
@Service("i18nService")
public class I18nGermanService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hallo Welt! - Deutsch";
    }
}

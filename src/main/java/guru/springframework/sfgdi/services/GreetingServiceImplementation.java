package guru.springframework.sfgdi.services;

public class GreetingServiceImplementation implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World!";
    }
}

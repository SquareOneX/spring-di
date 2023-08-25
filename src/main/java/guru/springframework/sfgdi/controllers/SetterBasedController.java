package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;

public class SetterBasedController{
    private GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

    public GreetingService getGreetingService() {
        return greetingService;
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}

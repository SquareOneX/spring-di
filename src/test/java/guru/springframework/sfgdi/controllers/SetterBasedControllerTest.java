package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServiceImplementation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterBasedControllerTest {
    SetterBasedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterBasedController();
        controller.setGreetingService(new GreetingServiceImplementation());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}
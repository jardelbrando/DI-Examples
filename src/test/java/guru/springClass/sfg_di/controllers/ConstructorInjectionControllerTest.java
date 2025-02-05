package guru.springClass.sfg_di.controllers;

import guru.springClass.sfg_di.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectionControllerTest {

    ConstructorInjectionController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectionController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}
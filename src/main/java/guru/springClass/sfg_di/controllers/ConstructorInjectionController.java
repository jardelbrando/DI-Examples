package guru.springClass.sfg_di.controllers;

import guru.springClass.sfg_di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectionController {

    private final GreetingService greetingService;

    //@Autowired in Spring 4.2 is optional in constructor injection
    public ConstructorInjectionController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}

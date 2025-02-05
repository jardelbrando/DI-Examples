package guru.springClass.sfg_di.controllers;

import guru.springClass.sfg_di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectionController {

    @Qualifier("propertyInjectionGreetingService")
    @Autowired //Tell spring to inject an instance the greeting service
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}

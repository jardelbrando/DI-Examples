package guru.springClass.sfg_di.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectionGreetingService implements GreetingService{
    @Override
    public String sayGreeting(){
        return "Hello World - Property";
    }
}

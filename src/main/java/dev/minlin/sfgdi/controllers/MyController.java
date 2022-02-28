package dev.minlin.sfgdi.controllers;

import dev.minlin.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greeting(){
        return greetingService.sayGreeting();
    }
}

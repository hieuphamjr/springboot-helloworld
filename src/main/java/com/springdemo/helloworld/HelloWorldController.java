package com.springdemo.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping
    public String helloWorld() {
        return "Hello World from Pham Van Hieu";
    }

    @RequestMapping("/goodbye")
    public String goodbye() {
        return "Goodbye from Pham Van Hieu";
    }
}

package org.nicholas.demohello.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/hello")
    public String sayHelloTo(@RequestParam(required = false) String name) {
        return "Hello " + name;
    }

    @GetMapping
    public String home(){
        return "Welcome home!";
    }
}

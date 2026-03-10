package com.bridgelabz.springbootproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
    @GetMapping("/hello/query")
    public String sayHelloQuery(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }
}
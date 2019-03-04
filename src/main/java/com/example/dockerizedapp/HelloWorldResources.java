package com.example.dockerizedapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResources {

    @RequestMapping("/")
    public String showMeHelloWorld(){

        return "Hello karimou";
    }
}

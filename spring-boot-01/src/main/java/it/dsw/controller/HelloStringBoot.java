package it.dsw.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloStringBoot {

    @RequestMapping("/hello")
    public String hello(){
        return "hello string boot";
    }
}

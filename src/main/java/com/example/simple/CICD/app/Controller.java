package com.example.simple.CICD.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class Controller {
    @GetMapping
    public String home(){
        return "this is simple end point to implement CICD. ";
    }

 
}



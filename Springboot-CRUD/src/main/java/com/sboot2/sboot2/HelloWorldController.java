package com.sboot2.sboot2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

@RequestMapping("/hello")
    public String hello(){
        return "HW";

    }
    
}

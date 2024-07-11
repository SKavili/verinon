package com.cbs.userservice.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @Autowired
    private ExampleClient exampleClient;

    @GetMapping("/")
    public String getResource() {
        return exampleClient.hello();
    }
}

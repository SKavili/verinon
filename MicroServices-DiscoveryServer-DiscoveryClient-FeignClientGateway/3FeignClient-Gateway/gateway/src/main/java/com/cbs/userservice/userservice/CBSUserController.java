package com.cbs.userservice.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CBSUserController {

    @Autowired
    private IUserClient client;

    @GetMapping("/user")
    public String bb() {
        System.out.println("In CBSUserController");
        return client.hello();
    }
}

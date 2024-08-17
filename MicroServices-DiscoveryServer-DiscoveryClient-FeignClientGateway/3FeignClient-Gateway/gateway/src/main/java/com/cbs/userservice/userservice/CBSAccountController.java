package com.cbs.userservice.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CBSAccountController {

    @Autowired
    private IAccountClient client;

    @GetMapping("/account")
    public String bb() {
        System.out.println("In CBSAccountController2222222222");
        return client.hello();
    }
}

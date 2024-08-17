package com.cbs.userservice.userservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class AccountController {

	@RequestMapping("/account")
	public String  hello() {
		return "I am in server 8082, my app name is Account Service, mapped with /account ";
	}

}

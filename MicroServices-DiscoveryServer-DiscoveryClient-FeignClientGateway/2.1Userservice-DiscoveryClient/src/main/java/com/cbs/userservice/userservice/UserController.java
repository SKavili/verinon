package com.cbs.userservice.userservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class UserController {

	@RequestMapping("/user")
	public String  hello() {
		return "I am in server 8081, my app name is userservice1, mapped with /user ";
	}

}

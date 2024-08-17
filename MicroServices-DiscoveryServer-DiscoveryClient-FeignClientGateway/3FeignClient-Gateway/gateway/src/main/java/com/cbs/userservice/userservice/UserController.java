package com.cbs.userservice.userservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class UserController {

	@RequestMapping("/hellouser")
	public String  hello() {
		return "I am in server 8080, my app name is userservice2, mapped with /hellouser ";
	}

}

package com.cbs.userservice.userservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class UserController {

	@RequestMapping("/hellouser")
	public String  hello() {
		return "Hello user in app2";
	}

}

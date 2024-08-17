package com.cbs.userservice.userservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "USERSERVICE1")
public interface IUserClient {

    @RequestMapping("/user")
	public String  hello() ;
}


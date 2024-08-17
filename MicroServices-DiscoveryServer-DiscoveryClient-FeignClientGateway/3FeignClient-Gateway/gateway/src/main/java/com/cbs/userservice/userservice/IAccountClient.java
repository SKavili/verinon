package com.cbs.userservice.userservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "ACCOUNTSERVICE2")
public interface IAccountClient {

    @RequestMapping("/account")
	public String  hello() ;
}


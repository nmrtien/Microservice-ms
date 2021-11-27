package com.accountms.controller;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  
@RequestMapping("/account")
public class AccountController {
	private static Logger logger = Logger.getLogger(AccountController.class.getName());
	
	@RequestMapping("/home")
	public String home() {
		
		return "account";
	}
	
	@RequestMapping("/list")
	public String getProducts() {
		logger.info("GET ALL ACCOUNT !");
		return "GET ALL ACCOUNT !";
	}
}

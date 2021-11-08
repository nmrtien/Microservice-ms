package com.tiennv.product.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiennv.product.service.ProductService;

@RestController  
@RequestMapping("/")
public class ProductController {
	
	private static Logger logger = Logger.getLogger(ProductController.class.getName());
	
	@Autowired
	private ProductService service;
	
	@RequestMapping("/")
	public String home() {
		
		return "product";
	}
	
	@RequestMapping("/products")
	public Map<String, Object> getProducts() {
		Map<String, Object> response = new HashMap<>();
		try {
			response.put("status", 200);
			response.put("message", "Get products successfull !");
			response.put("products", service.getProducts());
		} catch (Exception e) {
			logger.info("ERROR WHEN GET PRODUCTS " + e);
			response.put("status", 200);
			response.put("message", "Get products successfull !");
			response.put("products", "");
		}
		return response;
	}

}

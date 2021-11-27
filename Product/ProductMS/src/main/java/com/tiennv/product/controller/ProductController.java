package com.tiennv.product.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiennv.product.service.ProductService;
import com.tiennv.product.model.Product;

@RestController  
@RequestMapping("/product")
public class ProductController {
	
	private static Logger logger = Logger.getLogger(ProductController.class.getName());
	
	@Autowired  
	private Environment env;
	
//	@Autowired
//	private ProductService service;
	
	@RequestMapping("/home")
	public String home() {
		
		return "product";
	}
	
	@RequestMapping("/list")
	public String getProducts() {
//		Map<String, Object> response = new HashMap<>();
//		try {
//			response.put("status", 200);
//			response.put("message", "Get products successfull !");
//			response.put("products", service.getProducts());
//		} catch (Exception e) {
//			logger.info("ERROR WHEN GET PRODUCTS " + e);
//			response.put("status", 500);
//			response.put("message", "Get products error !");
//			response.put("products", "");
//		}
		logger.info("GET ALL PRODUCTS !");
		return "GET ALL PRODUCTS !";
	}
	
	@RequestMapping("/error")
	public Map<String, Object> error() {
		Map<String, Object> response = new HashMap<>();
		response.put("status", 500);
		response.put("message", "INTERNAL SERVER ERROR !");
		logger.info("error !");
		return response;
	}
	
//	@RequestMapping("/product")
//	public Map<String, Object> getProducts() {
//		Map<String, Object> response = new HashMap<>();
//		try {
//			response.put("status", 200);
//			response.put("message", "Get products successfull !");
//			response.put("products", service.getProducts());
//		} catch (Exception e) {
//			logger.info("ERROR WHEN GET PRODUCTS " + e);
//			response.put("status", 500);
//			response.put("message", "Get products error !");
//			response.put("products", "");
//		}
//		return response;
//	}
	

}

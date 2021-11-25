package com.galleryms.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController  
@RequestMapping("/") 
public class GalleryController {
	
	@Autowired  
	  private RestTemplate restTemplate;
	
	@Autowired  
	 private Environment env;
	
	@RequestMapping("/")  
	   public String home() {
		return "This is the admin area of Gallery service running at port: " + env.getProperty("local.server.port"); 
	      // This is useful for debugging  
	 // When having multiple instance of gallery service running at different ports. // We load balance among them, and display which instance received the request.  return "Hello from Gallery Service running at port: " + env.getProperty("local.server.port");  
	   }  

	   @RequestMapping("/{id}")  
	   public Map<String, Object> getGallery(@PathVariable final int id) {  
	      // create gallery object  
		   Map<String, Object> gallery = new HashMap<>();  

	      // get list of available images   
	 List<Object> images = restTemplate.getForObject("http://product-service/products/", List.class);  
	      gallery.put("data",images);  

	      return gallery;  
	   }  

	   // -------- Admin Area --------  
	 // This method should only be accessed by users with role of 'admin' // We'll add the logic of role based auth later  @RequestMapping("/admin")  
	   public String homeAdmin() {  
	      return "This is the admin area of Gallery service running at port: " + env.getProperty("local.server.port");  
	   }  
}

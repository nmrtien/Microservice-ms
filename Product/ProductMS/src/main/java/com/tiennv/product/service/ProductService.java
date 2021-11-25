package com.tiennv.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiennv.product.model.Product;
import com.tiennv.product.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;

	public List<Product> getProducts() {
		return repository.findAll();
	}

}

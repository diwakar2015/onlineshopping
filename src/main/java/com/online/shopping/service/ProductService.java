package com.online.shopping.service;

import java.util.Collection;

import com.online.shopping.model.Product;

public interface ProductService {
	
	public void addProduct(Product product);
	public Collection<Product> getAllProducts();
	public Product getProductById(int id);

}

package com.online.shopping.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.shopping.exceptions.ProductAlreadyExistsException;
import com.online.shopping.exceptions.ProductNotFoundException;
import com.online.shopping.model.Product;
import com.online.shopping.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;

	@Override
	public void addProduct(Product product) {
		try {
			productRepository.add(product);
		} catch (ProductAlreadyExistsException e) {
			e.printStackTrace();
		}

	}

	@Override
	public Collection<Product> getAllProducts() {
		return productRepository.getAllProducts();
	}

	@Override
	public Product getProductById(int id) {
		Product prod = null;
		try {
			prod = productRepository.getProductById(id);
		} catch (ProductNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prod;
	}

}

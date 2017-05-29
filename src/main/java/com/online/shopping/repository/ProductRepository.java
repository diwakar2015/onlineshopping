package com.online.shopping.repository;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.online.shopping.exceptions.ProductAlreadyExistsException;
import com.online.shopping.exceptions.ProductNotFoundException;
import com.online.shopping.model.Product;

@Repository
public class ProductRepository {

	Logger logger = Logger.getLogger(ProductRepository.class);

	private Map<Integer, Product> productCache = new ConcurrentHashMap<>();

	public void add(Product product) throws ProductAlreadyExistsException {

		if (productCache.get(product.getId()) != null) {
			throw new ProductAlreadyExistsException(
					"Product with id " + product.getId() + " already exists, please try update");
		} else {
			productCache.put(product.getId(), product);
			logger.info("Product added into the repositry" + product);
		}

	}

	public Collection<Product> getAllProducts() {
		return productCache.values();
	}

	public Product getProductById(int id) throws ProductNotFoundException {
		Product prod = productCache.get(id);
		if (prod != null) {
			return prod;
		} else {
			throw new ProductNotFoundException("No such product found in the database with id " + id);
		}
	}

}

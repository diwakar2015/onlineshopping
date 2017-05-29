package com.online.shopping.api;

import java.util.Collection;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.online.shopping.model.Product;
import com.online.shopping.service.ProductService;

@RestController
@RequestMapping("v0/products")
public class ProductController {

	Logger logger = Logger.getLogger(ProductController.class);

	@Autowired
	ProductService productService;

	//BASE_URL/v0/products/ -- POST request
	@RequestMapping(method = RequestMethod.POST)
	public void addProduct(@RequestBody Product product) {
		logger.info("Request received to add product " + product);
		productService.addProduct(product);
		logger.info("product added");
	}

	//BASE_URL/v0/products/ GET request
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public Collection<Product> getProducts() {
		logger.info("Request received to get all products");
		Collection<Product> prodList = productService.getAllProducts();
		logger.info("Size of the product list is " + prodList.size());
		return prodList;
	}

	//BASE_URL/v0/products/10
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Product getProductById(@PathVariable("id") Integer productId) {
		logger.info("Request received to get the product by id " + productId);
		Product prod = productService.getProductById(productId);
		logger.info("Product fetched : " + prod);
		return prod;
	}
	
	@RequestMapping(value = "/{id}/price", method = RequestMethod.GET)
	@ResponseBody
	public Integer getProductPriceById(@PathVariable("id") Integer id) {
		return 0;
	}

}

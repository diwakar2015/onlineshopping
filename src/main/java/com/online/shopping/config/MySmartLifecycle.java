package com.online.shopping.config;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Service;

import com.online.shopping.model.Product;
import com.online.shopping.service.ProductService;

@Service
public class MySmartLifecycle implements SmartLifecycle {

	Logger logger = Logger.getLogger(MySmartLifecycle.class);

	@Autowired
	ProductService productService;

	@Override
	public boolean isRunning() {
		return false;
	}

	@Override
	public void start() {
		String[] prodName = { "Nokia", "iPhone", "iwatch" };
		for (int i = 0; i < 3; i++) {
			logger.info("Adding dummy products....");
			Product product = new Product();
			product.setId(i + 1);
			product.setName(prodName[i]);
			product.setPrice((i + 1) * 1000);
			productService.addProduct(product);
			logger.info("added dummy products.." + product);
		}

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

	@Override
	public int getPhase() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isAutoStartup() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void stop(Runnable arg0) {
		// TODO Auto-generated method stub

	}

}

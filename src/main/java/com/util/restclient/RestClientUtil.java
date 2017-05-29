package com.util.restclient;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.web.client.RestTemplate;

import com.online.shopping.model.Product;

public class RestClientUtil {

	public static void main(String[] args) {
		
		 String uri = "http://localhost:8080/springapp/v0/products/2";
	     
	    RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.getForObject(uri, String.class);
	     
	    //System.out.println("Response : "+ result);
	    
	    ObjectMapper mapper = new ObjectMapper();
	    
	    try {
			Product prod = mapper.readValue(result, Product.class);
			
			System.out.println(prod);
			System.out.println("Product Name: "+ prod.getName());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

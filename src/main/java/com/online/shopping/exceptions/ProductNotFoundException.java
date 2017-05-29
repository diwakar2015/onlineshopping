package com.online.shopping.exceptions;

public class ProductNotFoundException extends Exception{

	private static final long serialVersionUID = -5148957430632578649L;

	public ProductNotFoundException(String msg){
		super(msg);
	}
	
}

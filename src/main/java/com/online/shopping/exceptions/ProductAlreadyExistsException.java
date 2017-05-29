package com.online.shopping.exceptions;

public class ProductAlreadyExistsException extends Exception{

	private static final long serialVersionUID = -3904873069790340681L;

	public ProductAlreadyExistsException(String msg){
		super(msg);
	}
	
}

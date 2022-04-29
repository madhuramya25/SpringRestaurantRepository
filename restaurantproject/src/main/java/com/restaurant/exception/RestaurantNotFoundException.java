package com.restaurant.exception;

public class RestaurantNotFoundException extends RuntimeException{
	
	//private static final long serialVersionUID = 1L;
	
	private String message2;
	private static final long serialVersionUID = 1L;

	public RestaurantNotFoundException(String message2) {
		super();
		this.message2=message2;
		
	}
	public RestaurantNotFoundException() {

}

}

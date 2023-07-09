package com.app.custom_exception;

public class PassengerHandlingException  extends RuntimeException{
	
	public PassengerHandlingException(String errMsg) {
		super(errMsg);
	}

}

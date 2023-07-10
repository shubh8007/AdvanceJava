package com.app.customexception;

public class MovieHandlingException  extends RuntimeException{
	public MovieHandlingException(String errmsg) {
		super(errmsg);
	}

}

package com.rbn.soapdemo.exception;

public class CategoryNotFoundException extends Exception {

	public CategoryNotFoundException(String category) {
		super(category);
	}

}

package com.rbn.soapdemo.service;

import java.util.List;

import com.rbn.soapdemo.model.Product;

public interface ProductService {

	List<String> getProductCategories();
	
	List<String> getProducts(String category);
	
	boolean addProduct(String category, String product);
	
	List<Product> getProductsV2(String category);
}

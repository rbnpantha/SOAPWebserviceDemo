package com.rbn.soapdemo.webservice;

import java.util.List;

import javax.jws.WebService;

import com.rbn.soapdemo.model.Product;
import com.rbn.soapdemo.sei.ProductCatalogInterface;
import com.rbn.soapdemo.service.ProductService;
import com.rbn.soapdemo.serviceImpl.ProductServiceImpl;

@WebService(endpointInterface = "com.rbn.soapdemo.sei.ProductCatalogInterface")
public class ProductCatalog implements ProductCatalogInterface {

	ProductService productService = new ProductServiceImpl();

	@Override
	public List<String> getProductCategories() {
		return productService.getProductCategories();
	}

	@Override
	public List<String> getProducts(String category) {
		return productService.getProducts(category);
	}

	@Override
	public boolean addProduct(String category, String product) {
		return productService.addProduct(category, product);
	}

	@Override
	public List<Product> getProductsV2(String category) {
		return productService.getProductsV2(category);
	}

}

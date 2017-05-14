package com.rbn.soapdemo.sei;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.rbn.soapdemo.model.Product;

@WebService(name = "MeroShopCatalog", portName = "MeroShopCatalogPort", serviceName = "MeroShopCatalogService", targetNamespace = "http://www.meroshop.com")
public interface ProductCatalogInterface {

	@WebMethod(action = "fetch_categories", operationName = "fetchCategories")
	public List<String> getProductCategories();

	@WebMethod() // not required
	public List<String> getProducts(String category);
	
	public boolean addProduct(String category, String product);
	
	public List<Product> getProductsV2(String category);

}

package com.rbn.soapdemo.model;

public class Product {

	private int productId;
	private String name;
	private String sku; // stock keeping unit
	private double price;

	public Product(int productId, String name, String sku, double price) {
		this.productId = productId;
		this.name = name;
		this.sku = sku;
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

}

package com.rbn.soapdemo.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.rbn.soapdemo.exception.CategoryNotFoundException;
import com.rbn.soapdemo.model.Product;
import com.rbn.soapdemo.service.ProductService;

public class ProductServiceImpl implements ProductService {

	List<String> bookList = new ArrayList<>();
	List<String> musicList = new ArrayList<>();
	List<String> movieList = new ArrayList<>();

	public ProductServiceImpl() {
		bookList.add("Romeo and Juliet");
		bookList.add("The alchemist");
		bookList.add("Muna Madan");

		musicList.add("September Dreams");
		musicList.add("Broken Dreams");
		musicList.add("The Numb");

		movieList.add("Game of throne");
		movieList.add("3 idiots");
		movieList.add("Bahubali 2");
	}

	@Override
	public List<String> getProductCategories() {
		List<String> productCategories = new ArrayList<>();
		productCategories.add("Books");
		productCategories.add("Music");
		productCategories.add("Movies");
		return productCategories;
	}

	@Override
	public List<String> getProducts(String category) {
		switch (category.toLowerCase()) {
		case "books":
			return bookList;
		case "music":
			return musicList;
		case "movies":
			return movieList;
		default:
			return null;
		}
	}

	@Override
	public boolean addProduct(String category, String product) {
		switch (category.toLowerCase()) {
		case "books":
			return bookList.add(product);
		case "music":
			return musicList.add(product);
		case "movies":
			return movieList.add(product);
		default:
			return false;
		}
	}

	@Override
	public List<Product> getProductsV2(String category) {
		List<Product> productList = new ArrayList<>();
		productList.add(new Product(001, "Science In Action", "Books", 17.05));
		productList.add(new Product(002, "Land of Himalayas", "Books", 27.05));
		productList.add(new Product(003, "Java Programming", "Books", 29.15));
		return productList;
	}
}

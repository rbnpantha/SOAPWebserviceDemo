package com.rbn.soapdemo.main;

import javax.xml.ws.Endpoint;

import com.rbn.soapdemo.webservice.ProductCatalog;

//Java Provides Support for webservices in JDK itself we don't need JavaEE server for this.
//We can publish webservice as shown below:
//You can now run as Java Application
//Problem : It is single threaded so useful to development environment only.
public class SOAPDemoPublisherMain {

	public static void main(String[] args) {

		Endpoint.publish("http://localhost:8089/productCatalog", new ProductCatalog());
	}
}

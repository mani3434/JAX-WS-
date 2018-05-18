package com.fund.service;

import javax.xml.ws.Endpoint;

import com.fund.product.ProductCatalog;

public class Publisher {

	public static void main(String[] args) {
		
		
		Endpoint.publish("http://localhost:1234/catalog", new ProductCatalog());
	}
}

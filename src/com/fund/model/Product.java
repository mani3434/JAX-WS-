package com.fund.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlRootElement(name="product")
@XmlType(propOrder= {"name","isbn","price"})
public class Product {

	private String name;
	private String isbn;
	private double price;

	public Product() {
		
	}
	
	public Product(String name, String isbn, double price) {

		this.name = name;
		this.isbn = isbn;
		this.price = price;
	}

	
	
	@XmlElement(name="ProductName")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}

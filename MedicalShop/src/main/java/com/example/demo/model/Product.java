package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product_details")
public class Product {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int productId;
	private String productName;
	private String description;
	private double price;
	private int qunatity;
	private String ExpiryDate;
	private String manufacturer;
	private String categoryName;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productId, String productName, String description, double price, int qunatity, String expiryDate,
			String manufacturer, String categoryName) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.qunatity = qunatity;
		ExpiryDate = expiryDate;
		this.manufacturer = manufacturer;
		this.categoryName = categoryName;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQunatity() {
		return qunatity;
	}
	public void setQunatity(int qunatity) {
		this.qunatity = qunatity;
	}
	public String getExpiryDate() {
		return ExpiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		ExpiryDate = expiryDate;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}

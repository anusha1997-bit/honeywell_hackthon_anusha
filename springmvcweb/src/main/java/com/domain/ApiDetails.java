package com.domain;

public class ApiDetails {
	private String name;
	private double price;
	private String details;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "ApiDetails [name=" + name + ", price=" + price + ", Details=" + details + "]";
	}
}

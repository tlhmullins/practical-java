package com.course.practicaljava.rest.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Tire {

	@JsonProperty("diameter")
	private int size;

	@JsonIgnore
	private int price;
	private String manufacturer;

	public Tire() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Tire(String manufacturer, int size, int price) {
		super();
		this.size = size;
		this.price = price;
		this.manufacturer = manufacturer;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getPrice() {
		return price;
	}

	public int getSize() {
		return size;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Tire [size=" + size + ", price=" + price + ", manufacturer=" + manufacturer + "]";
	}

}

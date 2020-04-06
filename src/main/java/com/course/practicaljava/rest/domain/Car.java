package com.course.practicaljava.rest.domain;

import java.util.Date;
import java.util.List;

public class Car {

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String brand, String color, String type) {
		super();
		this.brand = brand;
		this.color = color;
		this.type = type;
		this.available = available;
		this.price = price;

	}

	private String brand;
	private String color;
	private String type;
	private int price;
	private boolean available;
	private Date firstReleaseDate;
	private List<String> additionalFeatures;
	private Engine engine;
	private List<Tire> compatibleTires;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public List<Tire> getCompatibleTires() {
		return compatibleTires;
	}

	public void setCompatibleTires(List<Tire> compatibleTires) {
		this.compatibleTires = compatibleTires;
	}

	public List<String> getAdditionalFeatures() {
		return additionalFeatures;
	}

	public void setAdditionalFeatures(List<String> additionalFeatures) {
		this.additionalFeatures = additionalFeatures;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + ", type=" + type + ", price=" + price + ", available="
				+ available + ", firstReleaseDate=" + firstReleaseDate + ", additionalFeatures=" + additionalFeatures
				+ ", engine=" + engine + ", compatibleTires=" + compatibleTires + "]";
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public Date getFirstReleaseDate() {
		return firstReleaseDate;
	}

	public void setFirstReleaseDate(Date firstReleaseDate) {
		this.firstReleaseDate = firstReleaseDate;
	}

}

package com.course.practicaljava.rest.service;

import java.util.List;

import com.course.practicaljava.rest.domain.Car;

public interface CarService {

	List<String> BRANDS = List.of("Toyota", "Honda", "Ford");
	List<String> COLORS = List.of("Red", "Black", "White");
	List<String> TYPES = List.of("Sedan", "SUV", "MPV");
	List<String> ADDITIONAL_FEATURES = List.of("GPS", "Alarm", "Media Player", "Sunroof", "Heated Seats", "BlueTooth");
	List<String> FUEL_TYPES = List.of("Hybrid", "Petrol", "Electric");
	List<String> TIRE_MANUFACTURERS = List.of("Goodyear", "Bridgestone", "Dunlop");

	Car generateCar();
}

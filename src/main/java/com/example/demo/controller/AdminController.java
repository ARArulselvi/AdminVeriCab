package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Car;
import com.example.demo.model.Driver;
import com.example.demo.service.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	public Driver driver;
	
	@Autowired
	public AdminService service;
	
	@PostMapping("/addDrivers")
	public Driver addDrivers(@Valid @RequestBody Driver driver) {
		
		return this.service.addDriver(driver);
	}
	
	@GetMapping("/viewDrivers")
	public Iterable<Driver> findAllDrivers(){
		
		return this.service.viewDrivers();
	}
	
	@PutMapping("/updateDriver/{id}")
	public Driver updateDriver(@PathVariable(value="id") long id, @RequestBody Driver driver) {
		
		return this.service.addDriver(driver);
	}
	
	@DeleteMapping("/deleteDriver/{id}")
	public void deleteDriver(@PathVariable(value="id") long id) {
		
		this.service.deleteDriver(id);
	}
	
	@PostMapping("/addCars")
	public Car addCars(@Valid @RequestBody Car car) {
		
		return this.service.addCar(car);
	}
	
	@GetMapping("/viewCars")
	public Iterable<Car> findAllCars(){
		
		return this.service.viewCars();
	}
	
	@PutMapping("/updateCar/{id}")
	public Car updateDriver(@PathVariable(value="id") long id, @RequestBody Car car) {
		
		return this.service.addCar(car);
	}
	
	@DeleteMapping("/deleteCar/{id}")
	public void deleteCar(@PathVariable(value="id") long id) {
		
		this.service.deleteCar(id);
	}
	
	

}

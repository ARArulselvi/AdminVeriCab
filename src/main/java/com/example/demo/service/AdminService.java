package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Car;
import com.example.demo.model.Driver;
import com.example.demo.repo.CarRepo;
import com.example.demo.repo.DriverRepo;

@Service
public class AdminService {
	
	@Autowired
	public DriverRepo driverRepo;
	
	@Autowired
	public CarRepo carRepo;
	
	public Driver addDriver(Driver driver) {
		
		return this.driverRepo.save(driver);
		
	}
	
	public Iterable<Driver> viewDrivers(){
		
		return this.driverRepo.findAll();
	}
	
	public void deleteDriver(long id) {
		 this.driverRepo.deleteById(id);
		
	}
	
	public Car addCar(Car car) {
		
		return this.carRepo.save(car);
	}
	
	public Iterable<Car> viewCars(){
		
		return this.carRepo.findAll();
	}
	
	public void deleteCar(long id) {
		
		 this.carRepo.deleteById(id);
	
	}

}

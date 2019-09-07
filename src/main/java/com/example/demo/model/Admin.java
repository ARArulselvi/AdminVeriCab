package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Admin {
	
	private String username;
	private String password;
	
	@Autowired
	private Driver driver;
	
	@Autowired
	private Car car;

}

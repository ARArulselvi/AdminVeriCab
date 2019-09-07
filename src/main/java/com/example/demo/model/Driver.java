package com.example.demo.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Component 
@Entity 
@Table(name="vericab_driver")
public class Driver {
	
	    @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private long id;

	    @NotNull
	    private String name;  //First name+Last name
	    private String gender;  //To be entered as 'Male, 'Female', 'Transgender' only
	    private double rating;   //On a scale of 5
	    
	    @NotEmpty 
	    @Email
	    private String email; 
	    
	    private long phoneNumber;
	    
	    @NotNull 
	    @Past
	    private Date dob;
	    
	    @Column(nullable = false)
	    @Size(min=6, max=30)
	    @NotNull(message = "Username can not be null..!")
	    private String username;

	    @Column(nullable = false)
	    @NotNull(message = "Password can not be null..!")
	    private String password;
	    
	    @NotNull
	    private String driverPhotoLocation;
	    
	    @NotEmpty
	    private String licenseNumber; //Eg. MH-4089503248
	}



package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Driver;

@Repository
public interface DriverRepo extends CrudRepository<Driver, Long> {

}

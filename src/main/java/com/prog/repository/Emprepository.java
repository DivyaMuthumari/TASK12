package com.prog.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.prog.entity.Employee;


public interface Emprepository extends MongoRepository<Employee, String> {
	

}

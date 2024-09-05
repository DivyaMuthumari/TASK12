package com.prog.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prog.entity.Employee;
import com.prog.repository.Emprepository;


@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private Emprepository repo;
	
	@Override
	public List<Employee> getAllEmp() {
		return repo.findAll();

	}

	@Override
	public void addEmp(Employee employee) {
		employee.setId(UUID.randomUUID().toString().split("-")[0]);
		repo.save(employee);
		
	}
	
	@Override
	public void updateEmp(Employee employee) {
		repo.save(employee);
		
	}

	@Override
	public Employee getEmpById(String id) {
		Optional<Employee> e=repo.findById(id);
		if(e.isPresent()) {
			return e.get();
		}
		return null;

	}

	@Override
	public void deleteEmp(String id) {
		 this.repo.deleteById(id);
		
	}
	
	 

}

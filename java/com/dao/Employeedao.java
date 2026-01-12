package com.dao;

import java.util.List;

import com.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Employeedao {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();

	public void save(Employee employee) {
		transaction.begin();
		manager.persist(employee);
		transaction.commit();
	}

	public List<Employee> fetchEmployees() {
		return manager.createNativeQuery("select * from employee", Employee.class).getResultList();
	}

	public Employee findById(Long id) {
		return manager.find(Employee.class, id);
	}

	
	public void update(Employee employee) {
		transaction.begin();
		manager.merge(employee);
		transaction.commit();

	}
	
	public void deleteById(Long id) {
		Employee employee = findById(id);
		transaction.begin();
		manager.remove(employee);
		transaction.commit();
	}
}



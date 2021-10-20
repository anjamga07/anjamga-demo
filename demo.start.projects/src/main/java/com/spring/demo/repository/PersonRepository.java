package com.spring.demo.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import com.spring.demo.Entity.Person;

public interface PersonRepository extends CrudRepository<Person, Long>, 
											JpaSpecificationExecutor<Person> {
	Person findPerson(String name);
	//Person findByName(String surname);
	
}

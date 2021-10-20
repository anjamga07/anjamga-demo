package com.spring.demo.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Entity;

@Entity
public class Person {

	@Id
	@GeneratedValue
	private int idperson; 
	private String name; 
	private String surname;
	private int age;
	
	public Person() {}
	
	public Person(int idperson, String name, String surname, int age) {
		this.idperson = idperson;
		this.name = name;
		this.surname = surname;
		this.age = age;
	} 
	
	
	
}

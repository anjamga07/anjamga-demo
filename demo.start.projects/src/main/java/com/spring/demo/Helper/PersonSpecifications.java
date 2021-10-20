package com.spring.demo.Helper;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.spring.demo.Entity.Person;

public class PersonSpecifications {

	public static class AgeBetweenSpec implements Specification<Person> {

	private final int from; 
	private final int to; 
	
	public AgeBetweenSpec(int from, int to) {
		this.from = from; 
		this.to = to; 
	}
	
		@Override
		public Predicate toPredicate(Root<Person> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
		
			return criteriaBuilder.between(root.get("age"), from, to);
		}
	}
}

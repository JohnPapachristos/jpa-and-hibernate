package com.studying.springBootJpa.learnjpaandhibernate;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void insert(final Course course) {
		entityManager.merge(course);
	}
	
	public Course findById(final long id) {
		return entityManager.find(Course.class, id);
	}
	
	public void deleteById(final long id) {
		Course course = entityManager.find(Course.class, id);
		entityManager.remove(course);
	}
	
}

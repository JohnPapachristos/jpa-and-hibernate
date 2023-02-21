package com.studying.springBootJpa.learnjpaandhibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	private static String INSERT_QUERY = "INSERT INTO COURSE (ID, NAME, AUTHOR) VALUES (?, ?, ?);";
	private static String DELETE_QUERY = "DELETE FROM COURSE WHERE ID = ?";
	
	public void insert(final Course course) {
		springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
	}
	
	public void delete(final long id) {
		springJdbcTemplate.update(DELETE_QUERY, id);
	}
}

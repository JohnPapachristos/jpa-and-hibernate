package com.studying.springBootJpa.learnjpaandhibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{

	@Autowired
	private CourseJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.insert(new Course(6, "Dimitris", "Nothing special"));
		repository.insert(new Course(7, "Lilios", "Nothing special"));
		repository.insert(new Course(8, "Liliololis", "Nothing special"));
		repository.deleteById(8);
		System.out.println(repository.findById(6).toString());
	}

}

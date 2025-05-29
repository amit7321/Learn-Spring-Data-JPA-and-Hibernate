package com.example.Spring_Data_JPA_Hibernate;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Spring_Data_JPA_Hibernate.entity.Course;
import com.example.Spring_Data_JPA_Hibernate.entity.Person;
import com.example.Spring_Data_JPA_Hibernate.jpa.CourseRepository;
import com.example.Spring_Data_JPA_Hibernate.jpa.PersonJpaRepository;

@SpringBootApplication
public class SpringDataJpaHibernateApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	CourseRepository courseRepository;
	// PersonJpaRepository personJpaRepository;
	// PersonJdbcDao personJdbcDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaHibernateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// logger.info("All user --- {}", personJdbcDao.findAll());

		/*
		 * logger.info("User id 10 --- {}", personJdbcDao.findById(10));
		 * logger.info("Delete id 11 --- {}", personJdbcDao.deleteById(11));
		 * logger.info("Insert 21 --- {}", personJdbcDao.insert(new Person(21, "Tung",
		 * "Hanoi", new Date())));
		 */

		/*
		 * logger.info("User id 10001 --- {}", personJpaRepository.findById(10001));
		 * logger.info("Insert 10004 --- {}", personJpaRepository.insert(new
		 * Person(10004, "Tung", "Hanoi", new Date())));
		 * logger.info("Update 10003 --- {}", personJpaRepository.update(new
		 * Person(10003, "hazen", "Hanoi", new Date())));
		 * logger.info("All user --- {}", personJpaRepository.findAll());
		 */

		Course course = courseRepository.findById(10001L);
		logger.info("course 10001L --- {}", course);
		courseRepository.deleteById(10002L);
		courseRepository.save(new Course("Microservices in 100 Steps"));

	}

}

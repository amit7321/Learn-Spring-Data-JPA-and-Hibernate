package com.example.Spring_Data_JPA_Hibernate;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Spring_Data_JPA_Hibernate.jdbc.Person;
import com.example.Spring_Data_JPA_Hibernate.jdbc.PersonJdbcDao;

@SpringBootApplication
public class SpringDataJpaHibernateApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJdbcDao personJdbcDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaHibernateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// logger.info("All user --- {}", personJdbcDao.findAll());
		logger.info("User id 10 --- {}", personJdbcDao.findById(10));
		//logger.info("Delete id 11 --- {}", personJdbcDao.deleteById(11));
		logger.info("Insert 21 --- {}", personJdbcDao.insert(new Person(21, "Tung", "Hanoi", new Date())));
		

	}

}

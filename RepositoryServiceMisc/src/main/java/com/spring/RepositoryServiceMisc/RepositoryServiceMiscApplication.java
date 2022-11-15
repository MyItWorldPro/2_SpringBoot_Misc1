package com.spring.RepositoryServiceMisc;

import com.spring.RepositoryServiceMisc.controller.RepositorySvcController;
import com.spring.RepositoryServiceMisc.repository.JpaRepoExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootApplication
public class RepositoryServiceMiscApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(RepositoryServiceMiscApplication.class);

	@Autowired
	private JpaRepoExample jpaRepoExample;

	public static void main(String[] args) {
		SpringApplication.run(RepositoryServiceMiscApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try {
			jpaRepoExample.saveJpaData();
		} catch (DataAccessException ex) {
			logger.info("JPA - My Catch Block from Run Method: Class: {}", ex.getClass());
			logger.info("JPA - My Catch Block from Run Method: Message: {}", ex.getMessage());
		}
	}
}

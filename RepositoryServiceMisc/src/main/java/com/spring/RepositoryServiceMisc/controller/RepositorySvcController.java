package com.spring.RepositoryServiceMisc.controller;

import com.spring.RepositoryServiceMisc.entities.Book;
import com.spring.RepositoryServiceMisc.repository.JpaRepoExample;
import com.spring.RepositoryServiceMisc.repository.SpringJdbcRepository;
import com.spring.RepositoryServiceMisc.repository.SpringJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/repoSvc")
public class RepositorySvcController {

    private static final Logger logger = LoggerFactory.getLogger(RepositorySvcController.class);

    @Autowired
    private SpringJdbcRepository springJdbcRepository;

    @Autowired
    private SpringJpaRepository springJpaRepository;

    @Autowired
    private JpaRepoExample jpaRepoExample;

    @PostMapping("/saveDataJDBC")
    public ResponseEntity<String> saveDataJDBC() {
        logger.info("saveDataJDBC request started");

        try {
            springJdbcRepository.insertBookDataJdbc();
        } catch (DataAccessException ex) {
            logger.info("JDBC - My Data Access Exception: Class: {}", ex.getClass());
            logger.info("JDBC - My Data Access Exception: Message: {}", ex.getMessage());
            logger.error("JDBC - My Data Access Exception: ", ex);
        }

        return new ResponseEntity<>("JDBC: Data Saved Successfully!", HttpStatus.OK);
    }

    @PostMapping("/saveSpringDataJPA")
    public ResponseEntity<String> saveSpringDataJPA() {
        logger.info("saveSpringDataJPA request started");

        Book book = new Book();
        book.setBookid(2);
        book.setBookname("Java Book Name 2");
        book.setBookauthor("Java Author Name 2");

        try {
            springJpaRepository.save(book);
        } catch (DataAccessException ex) {
            logger.info("Spring Data JPA - My Data Access Exception: Class: {}", ex.getClass());
            logger.info("Spring Data JPA - My Data Access Exception: Message: {}", ex.getMessage());
            logger.error("Spring Data JPA - My Data Access Exception: ", ex);
            return new ResponseEntity<>("Spring Data JPA: INTERNAL_SERVER_ERROR!", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>("Spring Data JPA: Data Saved Successfully!", HttpStatus.OK);
    }

    @PostMapping("/saveDataJPA")
    public ResponseEntity<String> saveDataJPA() {
        logger.info("saveDataJPA request started");

        //jpaRepoExample.saveJpaData();

        try {
            jpaRepoExample.saveJpaData();
        } catch (DataAccessException ex) {
            logger.info("JPA - My Catch Block: Class: {}", ex.getClass());
            logger.info("JPA - My Catch Block: Message: {}", ex.getMessage());
            return new ResponseEntity<>("JPA: INTERNAL_SERVER_ERROR!", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>("JPA: Data Saved Successfully!", HttpStatus.OK);
    }

}

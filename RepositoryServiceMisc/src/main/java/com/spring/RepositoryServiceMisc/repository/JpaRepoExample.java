package com.spring.RepositoryServiceMisc.repository;

import com.spring.RepositoryServiceMisc.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Controller
public class JpaRepoExample {

    @Autowired
    private EntityManager entityManager;

    @Transactional
    public void saveJpaData(){
        Book book = new Book();
        book.setBookid(3);
        book.setBookname("Java Book Name 3");
        book.setBookauthor("Java Author Name 3");
        entityManager.persist(book);
        System.out.println("Saved Successfully!");
    }


}

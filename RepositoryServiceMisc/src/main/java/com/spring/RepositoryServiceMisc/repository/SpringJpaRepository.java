package com.spring.RepositoryServiceMisc.repository;

import com.spring.RepositoryServiceMisc.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public interface SpringJpaRepository extends JpaRepository<Book, Integer> {

}

package com.misc.TransactionMgmt.repo;

import com.misc.TransactionMgmt.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Author, Integer> {
}

package com.misc.TransactionMgmt.repo;

import com.misc.TransactionMgmt.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Integer> {
}

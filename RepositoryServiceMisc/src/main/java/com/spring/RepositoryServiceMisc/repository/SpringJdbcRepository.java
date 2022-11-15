package com.spring.RepositoryServiceMisc.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SpringJdbcRepository {

    private static final Logger logger = LoggerFactory.getLogger(SpringJdbcRepository.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertBookDataJdbc() {
        String sql = "insert into book(bookid,bookname,bookauthor) values(1,'Java Book Name 1','Java Author Name 1')";
        jdbcTemplate.update(sql);
        logger.info("JDBC - Data persist done successfully using Spring JDBC!");
    }

}

package com.spring.RepositoryServiceMisc.entities;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {

    @Id
    private Integer bookid;

    private String bookname;

    @Column(length = 10)
    private String bookauthor;

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookauthor() {
        return bookauthor;
    }

    public void setBookauthor(String bookauthor) {
        this.bookauthor = bookauthor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookid=" + bookid +
                ", bookname='" + bookname + '\'' +
                ", bookauthor='" + bookauthor + '\'' +
                '}';
    }
}

package com.misc.TransactionMgmt.dto;

import java.io.Serializable;

public class BooksDetailsDto implements Serializable {

    private String bookName;
    private String authorName;
    private String authorAddress;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorAddress() {
        return authorAddress;
    }

    public void setAuthorAddress(String authorAddress) {
        this.authorAddress = authorAddress;
    }
}

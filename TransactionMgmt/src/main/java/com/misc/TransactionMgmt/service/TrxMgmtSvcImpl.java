package com.misc.TransactionMgmt.service;

import com.misc.TransactionMgmt.dto.BooksDetailsDto;
import com.misc.TransactionMgmt.entities.Author;
import com.misc.TransactionMgmt.entities.Book;
import com.misc.TransactionMgmt.repo.AuthorRepo;
import com.misc.TransactionMgmt.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
public class TrxMgmtSvcImpl implements TrxMgmtSvc {

    @Autowired
    private BookRepo bookRepo;

    @Autowired
    private AuthorRepo authorRepo;

    @Override
    @Transactional
    public BooksDetailsDto saveBookDetails(BooksDetailsDto booksDetailsDto) {
        //save author
        Author author = saveAuthor(booksDetailsDto);

        //save book
        saveBook(booksDetailsDto, author);

        return booksDetailsDto;
    }

    private Author saveAuthor(BooksDetailsDto booksDetailsDto) {
        Author author = new Author();
        author.setAuthorName(booksDetailsDto.getAuthorName());
        author.setAuthorAddress(booksDetailsDto.getAuthorAddress());
        authorRepo.save(author);
        return author;
    }

    private Book saveBook(BooksDetailsDto booksDetailsDto, Author author) {
        Book book = new Book();
        book.setBookName(booksDetailsDto.getBookName());
        book.setBookAuthor(author);
        bookRepo.save(book);
        return book;
    }

}

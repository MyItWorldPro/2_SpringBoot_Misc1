package com.misc.TransactionMgmt.service;

import com.misc.TransactionMgmt.dto.BooksDetailsDto;

public interface TrxMgmtSvc {
    BooksDetailsDto saveBookDetails(BooksDetailsDto booksDetailsDto);
}

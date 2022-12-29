package com.misc.TransactionMgmt.controller;

import com.misc.TransactionMgmt.dto.BooksDetailsDto;
import com.misc.TransactionMgmt.service.TrxMgmtSvcImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/trxMgmt")
public class TrxMgmtController {

    @Autowired
    private TrxMgmtSvcImpl trxMgmtSvcImpl;

    @PostMapping("/saveBookDetails")
    public ResponseEntity<BooksDetailsDto> saveBookDetails(@RequestBody BooksDetailsDto booksDetailsDto) {
        BooksDetailsDto bDetails = trxMgmtSvcImpl.saveBookDetails(booksDetailsDto);
        return new ResponseEntity<BooksDetailsDto>(bDetails, HttpStatus.CREATED);
    }

}

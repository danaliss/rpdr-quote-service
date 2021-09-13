package com.danaliss.rpdrquoteservice.controller;

import com.danaliss.rpdrquoteservice.Service;
import com.danaliss.rpdrquoteservice.model.ClientQuote;
import com.danaliss.rpdrquoteservice.model.Quote;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Slf4j
public class PublicApiController {

    @Autowired
    Service service;

    @GetMapping("/quotes")
    @ResponseStatus(value = HttpStatus.OK)
    public List<Quote> fetchAllQueens() {

        return service.fetchAllQuotes();
    }


}

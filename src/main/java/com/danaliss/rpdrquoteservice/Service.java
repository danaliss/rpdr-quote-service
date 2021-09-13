package com.danaliss.rpdrquoteservice;

import com.danaliss.rpdrquoteservice.dao.QuoteRepository;
import com.danaliss.rpdrquoteservice.model.ClientQuote;
import com.danaliss.rpdrquoteservice.model.Quote;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;

@Component
@Slf4j
public class Service {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private Client client;

    @Autowired
    private QuoteRepository repository;

    public List<Quote> fetchAllQuotes() {

        return client.fetchQueensData()
                .stream().map(Quote::of)
                .collect(Collectors.toList());
    }

    public List<Quote> addQueensToDb() {
        List<Quote> quotes = new ArrayList<>();

        for (Quote quote : fetchAllQuotes()) {
            log.info(quote.toString());
            quotes.add(repository.save(quote));
        }

        return quotes;
    }
}

package com.danaliss.rpdrquoteservice;

import com.danaliss.rpdrquoteservice.model.ClientQuote;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class Service {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired Client client;

    public List<ClientQuote> fetchAllQuotes() {
        List<ClientQuote> clientQuotes = client.fetchQueensData();
        return clientQuotes;
    }
}

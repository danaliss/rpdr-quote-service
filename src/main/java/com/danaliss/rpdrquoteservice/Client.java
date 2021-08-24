package com.danaliss.rpdrquoteservice;

import com.danaliss.rpdrquoteservice.model.ClientQuote;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "quote-client",
        url = "${client.quote.url}")
public interface Client {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    List<ClientQuote> fetchQueensData();
}

package com.danaliss.rpdrquoteservice.model;

import lombok.Data;
import lombok.val;

import javax.persistence.*;

@Data
@Entity
@Table(name = "quote")
public class Quote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String quote;

    private int queenId;

    public static Quote of(final ClientQuote pClientQuote){
        // final Quote quote = new Queen();
        val quote = new Quote();

        quote.quote = pClientQuote.getQuote();

        return quote;
    }

}

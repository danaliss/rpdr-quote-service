package com.danaliss.rpdrquoteservice.dao;

import com.danaliss.rpdrquoteservice.model.Quote;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuoteRepository extends CrudRepository<Quote, Integer> {


}

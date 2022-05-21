package com.jorge.randomQuote.repositories;

import com.jorge.randomQuote.models.Quote;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuoteRepository extends CrudRepository<Quote, Integer>{
    
}

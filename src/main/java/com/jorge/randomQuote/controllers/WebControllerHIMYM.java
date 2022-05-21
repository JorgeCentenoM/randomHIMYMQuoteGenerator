package com.jorge.randomQuote.controllers;

import com.jorge.randomQuote.models.Quote;
import com.jorge.randomQuote.services.QuoteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebControllerHIMYM {

    @Autowired
    QuoteService quoteService;
    
    @RequestMapping("/webHIMYM")
    public String getRandomQuoteWeb(Model model){
        Quote quote = quoteService.getRandomQuote();
        model.addAttribute("quote", quote);
        return "indexHIMYM";
    }
}

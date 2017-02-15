package dongukc;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dongukc.Quote;
import dongukc.QuoteService;

@RestController
public class QuoteController {
    
    @Autowired
    private QuoteService quoteService;
    
    @RequestMapping("/api/quote/random")
    public Quote random() {
        return quoteService.randomQuote();
    }
    
    @RequestMapping("/api/quote/{author_id}")
    public ArrayList<Quote> getInfo(@PathVariable("author_id") Long authorId) {
       return quoteService.getQuotesByAuthorId(authorId);
    }
    
    @RequestMapping("/api/quote")
    public ArrayList<Quote> listQuotes() {
       return quoteService.listQuotes();
    }
    
    @RequestMapping(value = "/api/quote", method = RequestMethod.POST)
    public void saveQuote(@RequestBody Quote quote) {
        System.out.println(quote);
        
        System.out.println("Saving quote");
        quoteService.save(quote);
    }
}
package dongukc;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;

import dongukc.Quote;


public class QuoteServiceImpl implements QuoteServiceCustom {

    Random random = new Random();
    
    @Autowired
    private QuoteService quoteService;
    
    @Override
    public Quote randomQuote() {
        ArrayList<Quote> quotes = new ArrayList<Quote>();
        
        for (Quote q: this.quoteService.findAll() ) {
            quotes.add(q);
        }
        Quote q = quotes.get(random.nextInt(quotes.size()));
        return q;
    }
    
    @Override
    public ArrayList<Quote> getQuotesByAuthorId(Long authorId) {
    	ArrayList<Quote> quotes = new ArrayList<Quote>();
    	
    	for (Quote q: this.quoteService.findAll()) {
    	    if (q.getAuthorId() == authorId) {
    	        quotes.add(q);	
    	    }
        }
    	
    	return quotes;
    }
    
    @Override
    public ArrayList<Quote> listQuotes() {
    	ArrayList<Quote> quotes = new ArrayList<Quote>();
    	
    	for (Quote q: this.quoteService.findAll()) {
    	    quotes.add(q);
        }
    	
    	return quotes;
    }
}
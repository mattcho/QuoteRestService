package dongukc;

import java.util.ArrayList;

import dongukc.Quote;


public interface QuoteServiceCustom {
    public Quote randomQuote();
    public ArrayList<Quote> getQuotesByAuthorId(Long authorId);
    public ArrayList<Quote> listQuotes();
}
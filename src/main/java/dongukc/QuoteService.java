package dongukc;

import org.springframework.data.repository.CrudRepository;

import dongukc.Quote;

public interface QuoteService extends CrudRepository<Quote, Long>, QuoteServiceCustom {
	
}
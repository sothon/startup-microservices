package com.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchageController {
	
	@Autowired
	Environment environment;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private ExchangeValueRepository repository;
	
	@GetMapping("/currency-exchagne/form/{from}/to/{to}")
	public ExchangeValue retrieveExchagneValue(@PathVariable String from ,@PathVariable String to) {
		ExchangeValue exchangeValue = repository.findByFromAndTo(from, to);
		//exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		logger.info("{}",exchangeValue);
		return exchangeValue;
	}
	
}

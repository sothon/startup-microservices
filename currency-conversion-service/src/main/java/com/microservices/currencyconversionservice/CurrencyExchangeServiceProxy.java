package com.microservices.currencyconversionservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//@FeignClient(name="currency-exhange-service", url="localhost:8000")
//@FeignClient(name="currency-exhange-service")
@FeignClient(name="netflix-zuul-api-gateway-server")
@RibbonClient(name="currency-exhange-service")
public interface CurrencyExchangeServiceProxy {
	
//	@GetMapping("/currency-exchagne/form/{from}/to/{to}")
	@GetMapping("/currency-exhange-service/currency-exchagne/form/{from}/to/{to}")
	public CurrencyConversionBean retrieveExchagneValue(@PathVariable("from") String from ,@PathVariable("to") String to);
	
}

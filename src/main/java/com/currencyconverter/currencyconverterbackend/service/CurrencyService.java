package com.currencyconverter.currencyconverterbackend.service;

import com.currencyconverter.currencyconverterbackend.Repo.CurrencyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.currencyconverter.currencyconverterbackend.object.ExchangeRates;

import java.util.Optional;

@Service
public class CurrencyService {

    @Autowired
    private CurrencyRepo currencyRepo;


    public Double getRate(String fromCurrency, String toCurrency){
        Optional<ExchangeRates> exchangeRate = currencyRepo.findByFromCurrencyAndToCurrency(fromCurrency,toCurrency);
        return exchangeRate.map(ExchangeRates::getRate).orElse(null);
    }

}

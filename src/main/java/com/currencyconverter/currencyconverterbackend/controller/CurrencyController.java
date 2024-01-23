package com.currencyconverter.currencyconverterbackend.controller;


import com.currencyconverter.currencyconverterbackend.object.InputObject;
import com.currencyconverter.currencyconverterbackend.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/exchangerate")
public class CurrencyController {

    @Autowired
    private CurrencyService currencyService;

    @PostMapping("/exchange")
    private ResponseEntity<Double> GetExchangeValue(@RequestBody InputObject inputObject){
        Double rate = currencyService.getRate(inputObject.getSourceCurrency(),inputObject.getTargetCurrency());
        Double convertedAmount = rate * inputObject.getAmount() ;
        return new ResponseEntity<Double>(convertedAmount, HttpStatus.ACCEPTED);
    }




}

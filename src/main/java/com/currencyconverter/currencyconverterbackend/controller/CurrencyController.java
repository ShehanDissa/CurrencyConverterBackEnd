package com.currencyconverter.currencyconverterbackend.controller;

import com.currencyconverter.currencyconverterbackend.object.InputObject;
import com.currencyconverter.currencyconverterbackend.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import static java.lang.Double.parseDouble;


@RestController
@RequestMapping("/api/exchangerate")
@CrossOrigin
public class CurrencyController {

    @Autowired
    private CurrencyService currencyService;

    @PostMapping("/exchange")
    ResponseEntity<Double> GetExchangeValue(@RequestBody InputObject inputObject){
        Double rate = currencyService.getRate(inputObject.getSourceCurrency(),inputObject.getTargetCurrency());
        if (rate != null) {
            Double convertedAmount = rate * parseDouble(inputObject.getAmount());
            return new ResponseEntity<Double>(convertedAmount, HttpStatus.ACCEPTED);
        }
        else {
            return new ResponseEntity<Double>(HttpStatus.NOT_FOUND);
        }
    }




}

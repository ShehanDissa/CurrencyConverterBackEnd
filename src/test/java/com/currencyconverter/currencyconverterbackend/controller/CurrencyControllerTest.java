package com.currencyconverter.currencyconverterbackend.controller;

import com.currencyconverter.currencyconverterbackend.object.InputObject;
import com.currencyconverter.currencyconverterbackend.service.CurrencyService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CurrencyControllerTest {

    @Mock
    private CurrencyService currencyService;

    @InjectMocks
    private CurrencyController currencyController;

    @Test
    void testGetExchangeValue() {
        // Arrange
        InputObject inputObject = new InputObject("USD", "EUR", "100");
        Double expectedRate = 0.9;
        Double expectedConvertedAmount = 90.0;
        when(currencyService.getRate(inputObject.getSourceCurrency(), inputObject.getTargetCurrency())).thenReturn(expectedRate);

        // Act
        ResponseEntity<Double> responseEntity = currencyController.GetExchangeValue(inputObject);

        // Assert
        assertEquals(HttpStatus.ACCEPTED, responseEntity.getStatusCode());
        assertEquals(expectedConvertedAmount, responseEntity.getBody());
    }
}

package com.currencyconverter.currencyconverterbackend.controller;

import com.currencyconverter.currencyconverterbackend.object.InputObject;
import com.currencyconverter.currencyconverterbackend.service.CurrencyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CurrencyControllerIntegrationTest {

    @Autowired
    private CurrencyController currencyController;

    @Autowired
    private CurrencyService currencyService;

    @Test
    void testGetExchangeValue_HappyPath() {
        // Arrange
        InputObject inputObject = new InputObject("USD", "EUR", "100");

        // Act
        ResponseEntity<Double> responseEntity = currencyController.GetExchangeValue(inputObject);

        // Assert
        assertEquals(HttpStatus.ACCEPTED, responseEntity.getStatusCode());
        // assert value based on actual data in the database
    }

    @Test
    void testGetExchangeValue_RateNotFound() {
        // Arrange
        InputObject inputObject = new InputObject("USD", "XYZ", "100");

        // Act
        ResponseEntity<Double> responseEntity = currencyController.GetExchangeValue(inputObject);

        // Assert
        assertEquals(HttpStatus.NOT_FOUND, responseEntity.getStatusCode());
        // or assert appropriate error message or null value
    }
}

package com.currencyconverter.currencyconverterbackend.service;

import com.currencyconverter.currencyconverterbackend.Repo.CurrencyRepo;
import com.currencyconverter.currencyconverterbackend.object.ExchangeRates;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CurrencyServiceTest {

    @Mock
    private CurrencyRepo currencyRepo;

    @InjectMocks
    private CurrencyService currencyService;

    @Test
    void testGetRate_HappyPath() {
        // Arrange
        int id = 1;
        String fromCurrency = "USD";
        String toCurrency = "EUR";
        Double expectedRate = 0.85;
        ExchangeRates exchangeRate = new ExchangeRates(id, fromCurrency, toCurrency, expectedRate);
        when(currencyRepo.findByFromCurrencyAndToCurrency(fromCurrency, toCurrency)).thenReturn(Optional.of(exchangeRate));

        // Act
        Double actualRate = currencyService.getRate(fromCurrency, toCurrency);

        // Assert
        assertEquals(expectedRate, actualRate);
    }

    @Test
    void testGetRate_RateNotFound() {
        // Arrange
        String fromCurrency = "USD";
        String toCurrency = "CAD";
        when(currencyRepo.findByFromCurrencyAndToCurrency(fromCurrency, toCurrency)).thenReturn(Optional.empty());

        // Act
        Double actualRate = currencyService.getRate(fromCurrency, toCurrency);

        // Assert
        assertEquals(null, actualRate);
    }
}

package com.currencyconverter.currencyconverterbackend.Repo;

import com.currencyconverter.currencyconverterbackend.object.ExchangeRates;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CurrencyRepo extends JpaRepository<ExchangeRates,String> {

    Optional<ExchangeRates> findByFromCurrencyAndToCurrency(String fromCurrency, String toCurrency);

}

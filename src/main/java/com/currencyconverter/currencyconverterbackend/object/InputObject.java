package com.currencyconverter.currencyconverterbackend.object;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class InputObject {
    private String sourceCurrency;
    private String targetCurrency ;
    private Double amount;

    public String getSourceCurrency() {
        return sourceCurrency;
    }

    public String getTargetCurrency() {
        return targetCurrency;
    }

    public Double getAmount() {
        return amount;
    }
}

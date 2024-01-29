package com.currencyconverter.currencyconverterbackend.object;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public class InputObject {
    private String sourceCurrency;
    private String targetCurrency ;
    private String amount;

    public String getSourceCurrency() {
        return sourceCurrency;
    }

    public String getTargetCurrency() {
        return targetCurrency;
    }

    public String getAmount() {
        return amount;
    }
}

package com.amazon.khataApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@AllArgsConstructor
@Data
public class AmountDetails {
    private String currency;

    private BigDecimal value;

    private String localCurrency;

    private BigDecimal localValue;

}

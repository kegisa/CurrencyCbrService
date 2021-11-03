package com.victorlevin.CurrencyCbrService.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Value
@AllArgsConstructor
@Builder
public class CurrencyRate {
    private String charCode;
    private Double value;
}

package com.victorlevin.CurrencyCbrService.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Value
@AllArgsConstructor
@Builder
public class CurrencyNominalRate {
    private String numCode;
    private String charCode;
    private String nominal;
    private String name;
    private String value;
}

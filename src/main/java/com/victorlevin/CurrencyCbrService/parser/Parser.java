package com.victorlevin.CurrencyCbrService.parser;

import com.victorlevin.CurrencyCbrService.domain.CurrencyNominalRate;

import java.util.List;

public interface Parser {
    List<CurrencyNominalRate> parse(String ratesAsString);
}

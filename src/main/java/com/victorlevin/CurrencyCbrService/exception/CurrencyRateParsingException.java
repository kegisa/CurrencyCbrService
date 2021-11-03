package com.victorlevin.CurrencyCbrService.exception;

public class CurrencyRateParsingException extends RuntimeException {
    public CurrencyRateParsingException(Exception ex) {
        super(ex);
    }
}

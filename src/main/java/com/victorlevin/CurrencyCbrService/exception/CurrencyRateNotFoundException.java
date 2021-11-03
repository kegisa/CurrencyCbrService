package com.victorlevin.CurrencyCbrService.exception;

public class CurrencyRateNotFoundException extends RuntimeException {
        public CurrencyRateNotFoundException(String m) {
            super(m);
        }
    }
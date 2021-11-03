package com.victorlevin.CurrencyCbrService.service;

import com.victorlevin.CurrencyCbrService.domain.CurrencyRate;
import com.victorlevin.CurrencyCbrService.exception.CurrencyRateNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Slf4j
@Service
@RequiredArgsConstructor
public class RateService {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private final RatesGettingService ratesGettingService;

    public CurrencyRate getRateByCharCode(String charCode) {
        LocalDateTime time = LocalDateTime.now();
        String date = dtf.format(time);
        log.info("Getting rate for {}.", charCode);
        return ratesGettingService.getCurrencyRates(date).stream()
                .filter(rate -> rate.getCharCode().equals(charCode))
                .findFirst()
                .orElseThrow(() -> new CurrencyRateNotFoundException("Currency Rate not found. Currency:" + charCode + ", date:" + date));
    }


}

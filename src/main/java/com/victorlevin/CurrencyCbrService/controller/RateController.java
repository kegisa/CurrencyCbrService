package com.victorlevin.CurrencyCbrService.controller;

import com.victorlevin.CurrencyCbrService.domain.CurrencyRate;
import com.victorlevin.CurrencyCbrService.service.RateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "${app.rest.api.prefix}")
public class RateController {
    private final RateService rateService;

    @GetMapping("/{charCode}")
    public CurrencyRate getRateByCharCode(@PathVariable String charCode) {
        return rateService.getRateByCharCode(charCode);
    }
}
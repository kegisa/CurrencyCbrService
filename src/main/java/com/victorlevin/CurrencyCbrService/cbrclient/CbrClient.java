package com.victorlevin.CurrencyCbrService.cbrclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "cbrclient", url = "${cbr.url}", configuration = FeignConfig.class)
public interface  CbrClient {
    @GetMapping
    String getRatesByCbr();
}

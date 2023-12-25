package com.ph.stockman.product.infra.out.rest.client.config;

import com.ph.stockman.product.infra.out.rest.client.error.AlgumaCoisaErrorDecoder;
import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;

public class AlgumaCoisaClientConfiguration {

    @Bean
    public ErrorDecoder errorDecoder() {
        return new AlgumaCoisaErrorDecoder();
    }

}
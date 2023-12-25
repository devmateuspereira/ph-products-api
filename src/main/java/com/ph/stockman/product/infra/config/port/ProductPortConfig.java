package com.ph.stockman.product.infra.config.port;

import com.ph.stockman.product.application.port.query.ProductQueryPort;
import com.ph.stockman.product.application.service.query.ProductQueryService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductPortConfig {

    @Bean
    public ProductQueryPort productPort(/*providers e services*/) {
        //INJEÇÃO DE DEPENDECIAS
        return new ProductQueryService(/*providers e services*/);
    }

}
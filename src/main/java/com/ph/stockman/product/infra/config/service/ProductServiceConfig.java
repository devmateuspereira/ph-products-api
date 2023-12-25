package com.ph.stockman.product.infra.config.service;

import com.ph.stockman.product.application.service.query.ProductQueryService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductServiceConfig {

    @Bean
    public ProductQueryService productService(/*providers e services*/) {
        //INJEÇÃO DE DEPENDECIAS
        return new ProductQueryService(/*providers e services*/);
    }

}
package com.ph.stockman.product.infra.config.service;

import com.ph.stockman.product.application.service.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductServiceConfig {

    @Bean
    public ProductService productService(/*providers e services*/) {
        //INJEÇÃO DE DEPENDECIAS
        return new ProductService(/*providers e services*/);
    }

}
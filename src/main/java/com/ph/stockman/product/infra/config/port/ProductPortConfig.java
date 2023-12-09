package com.ph.stockman.product.infra.config.port;

import com.ph.stockman.product.application.port.ProductPort;
import com.ph.stockman.product.application.service.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductPortConfig {

    @Bean
    public ProductPort productPort(/*providers e services*/) {
        //INJEÇÃO DE DEPENDECIAS
        return new ProductService(/*providers e services*/);
    }

}
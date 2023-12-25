package com.ph.stockman.product.infra.out.rest.client;


import com.ph.stockman.product.infra.out.rest.client.config.AlgumaCoisaClientConfiguration;
import com.ph.stockman.product.infra.out.rest.model.AlgumaCoisaResponse;
import com.ph.stockman.product.shared.infra.in.web.Path;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "alguma-coisa",
        url = "${rest-service.alguma-coisa.host}:${rest-service.alguma-coisa.port}",
        configuration = {
                AlgumaCoisaClientConfiguration.class
        }
)
public interface AlgumaCoisaFeignClient {

    @GetMapping(path = Path.EXAMPLE)
    AlgumaCoisaResponse example(@PathVariable Long id);

}
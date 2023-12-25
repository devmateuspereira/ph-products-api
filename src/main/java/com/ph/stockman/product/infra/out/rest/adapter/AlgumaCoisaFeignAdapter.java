package com.ph.stockman.product.infra.out.rest.adapter;

import com.ph.stockman.product.application.provider.AlgumaCoisaProvider;
import com.ph.stockman.product.infra.out.rest.client.AlgumaCoisaFeignClient;
import com.ph.stockman.product.infra.out.rest.mapper.AlgumaCoisaMapper;
import feign.FeignException;
import feign.RetryableException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class AlgumaCoisaFeignAdapter implements AlgumaCoisaProvider {

    private final AlgumaCoisaFeignClient algumaCoisaFeignClient;

    @Override
    public Optional<Object> example(Long id) {
        try {
            var result = algumaCoisaFeignClient.example(id);
            if (Objects.isNull(result))
                return Optional.empty();
            return Optional.of(result).map(AlgumaCoisaMapper.INSTANCE::Method);
        } catch (FeignException.NotFound feignException) {
            return Optional.empty();
        } catch (RetryableException retryableException) {
            throw new RuntimeException(retryableException.getMessage());
        }
    }

}
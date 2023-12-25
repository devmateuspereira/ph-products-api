package com.ph.stockman.product.infra.out.rest.client.error;

import com.ph.stockman.product.shared.util.ErrorDecoderUtil;
import feign.Response;
import feign.codec.ErrorDecoder;

public class AlgumaCoisaErrorDecoder implements ErrorDecoder {

    private final ErrorDecoder errorDecoder = new Default();

    @Override
    public Exception decode(String methodKey, Response response) {
        final var algumaCoisaId = ErrorDecoderUtil.getPathVariableValue(response.request().url(), "algumacoisa");
        return switch (response.status()) {
            case 400 -> new RuntimeException("Object id " + algumaCoisaId + " not valid");
            case 404 -> new RuntimeException("Object id " + algumaCoisaId + " not found");
            default -> errorDecoder.decode(methodKey, response);
        };
    }

}
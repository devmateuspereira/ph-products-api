package com.ph.stockman.product.shared.util;

import java.util.Objects;

public class ErrorDecoderUtil {

    public static String getPathVariableValue(String url, String pathName) {
        if (Objects.isNull(url) || Objects.isNull(pathName))
            return "";
        final var value = url.split(pathName.concat("/"));
        return value.length == 2 ? value[1] : "";
    }

}
package com.ph.stockman.product.infra.out.database.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductJpaMapper {

    ProductJpaMapper INSTANCE = Mappers.getMapper(ProductJpaMapper.class);

}
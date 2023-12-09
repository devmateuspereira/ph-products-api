package com.ph.stockman.product.infra.out.database.repository;

import com.ph.stockman.product.infra.out.database.entity.ProductJpa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.repository.query.Param;

public interface ProductJpaRepository extends JpaRepository<ProductJpa, Long>, JpaRepositoryImplementation<ProductJpa, Long> {

    @Modifying
    @Query
    ProductJpa findByName(@Param("name") String name);

}
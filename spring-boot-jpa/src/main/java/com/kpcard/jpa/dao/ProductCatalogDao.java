package com.kpcard.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kpcard.jpa.product.ProductCatalog;

public interface ProductCatalogDao extends JpaRepository<ProductCatalog, Integer> {

}

package com.kpcard.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kpcard.jpa.product.ProductLine;

public interface ProductLineDao extends JpaRepository<ProductLine, String> {

}

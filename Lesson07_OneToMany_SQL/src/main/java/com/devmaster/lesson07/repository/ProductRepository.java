package com.devmaster.lesson07.repository;

import com.devmaster.lesson07.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

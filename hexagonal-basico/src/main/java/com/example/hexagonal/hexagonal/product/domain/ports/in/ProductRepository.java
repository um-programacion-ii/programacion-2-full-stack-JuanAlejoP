package com.example.hexagonal.hexagonal.product.domain.ports.in;

import com.example.hexagonal.hexagonal.product.domain.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    Product save(Product product);
    Optional<Product> findById(long id);
    List<Product> findAll();
    Optional<Product> update(Long id, Product product);
    boolean deleteById(long id);

}
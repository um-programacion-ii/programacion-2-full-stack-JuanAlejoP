package com.example.hexagonal.hexagonal.product.application.service;

import com.example.hexagonal.hexagonal.product.domain.model.Product;
import com.example.hexagonal.hexagonal.product.domain.ports.in.CreateProductUseCase;
import com.example.hexagonal.hexagonal.product.domain.ports.in.GetAllProductsUseCase;
import com.example.hexagonal.hexagonal.product.domain.ports.in.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService implements GetAllProductsUseCase, CreateProductUseCase {

    private final ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}

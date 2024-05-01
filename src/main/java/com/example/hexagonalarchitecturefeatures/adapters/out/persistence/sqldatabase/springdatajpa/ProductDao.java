package com.example.hexagonalarchitecturefeatures.adapters.out.persistence.sqldatabase.springdatajpa;

import com.example.hexagonalarchitecturefeatures.core.domain.Product;
import com.example.hexagonalarchitecturefeatures.ports.out.ProductReadOutPort;

import java.util.List;

public class ProductDao implements ProductReadOutPort {


    private ProductEntityRepository productEntityRepository;

    @Override
    public List<Product> findAll() {
        return productEntityRepository.findAll().stream()
                .map(pe -> new Product(pe.getId(), pe.getName(), pe.getCategory(),
                        pe.getPrice(), pe.getStock(), pe.getCost(),
                        pe.getCreationDate()))


                .toList();
    }

    @Override
    public List<Product> findAllByCategory(String category) {
        return productEntityRepository.findAllByCategory(category).stream()
                .map(ProductEntityMapper::of).toList();
    }
}

package com.example.hexagonalarchitecturefeatures.ports.out;

import com.example.hexagonalarchitecturefeatures.core.domain.Product;

import java.util.List;

public interface ProductReadOutPort {

    List<Product> findAll();

    List<Product> findAllByCategory(String category);
}

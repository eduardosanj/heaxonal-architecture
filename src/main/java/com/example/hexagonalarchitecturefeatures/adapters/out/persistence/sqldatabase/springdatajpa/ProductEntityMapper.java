package com.example.hexagonalarchitecturefeatures.adapters.out.persistence.sqldatabase.springdatajpa;

import com.example.hexagonalarchitecturefeatures.core.domain.Product;

public interface ProductEntityMapper {


    //Se puede usar un framework para mapear datos como mapstruct https://mapstruct.org
    static ProductEntity of(Product p) {
        return new ProductEntity(p.getId(), p.getName(), p.getCategory(),
                p.getPrice(), p.getStock(), p.getCost(),
                p.getCreationDate());
    }

    static Product of(ProductEntity pe) {
        return new Product(pe.getId(), pe.getName(), pe.getCategory(),
                pe.getPrice(), pe.getStock(), pe.getCost(),
                pe.getCreationDate());
    }

}

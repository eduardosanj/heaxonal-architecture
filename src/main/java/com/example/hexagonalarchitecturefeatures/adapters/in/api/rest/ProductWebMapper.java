package com.example.hexagonalarchitecturefeatures.adapters.in.api.rest;

import com.example.hexagonalarchitecturefeatures.core.domain.Product;

public interface ProductWebMapper {


    static ProductDTO of(Product product) {
        return new ProductDTO(product.getId(), product.getName(), product.getCategory(), product.getPrice(), product.getStock());
    }

    static Product of(ProductDTO productDTO) {
        return new Product(productDTO.id(), productDTO.name(), productDTO.category(), productDTO.price(), productDTO.stock(), null, null);
    }
}

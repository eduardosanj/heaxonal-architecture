package com.example.hexagonalarchitecturefeatures.ports.out;

import com.example.hexagonalarchitecturefeatures.core.domain.Product;

public interface ProductWriteOutPort {


    Product save(Product product);

    Product update(Product product);

    void deleteById(Long id);



}

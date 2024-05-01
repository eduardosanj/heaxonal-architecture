package com.example.hexagonalarchitecturefeatures.ports.in;

import com.example.hexagonalarchitecturefeatures.core.domain.Product;

public interface ProductWriteInPort {

    Product save(Product product);

    Product update(Product product);

    //Product

}

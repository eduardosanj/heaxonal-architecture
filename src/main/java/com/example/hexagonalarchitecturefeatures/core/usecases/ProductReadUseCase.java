package com.example.hexagonalarchitecturefeatures.core.usecases;

import com.example.hexagonalarchitecturefeatures.core.domain.Product;
import com.example.hexagonalarchitecturefeatures.ports.in.ProductReadInPort;
import com.example.hexagonalarchitecturefeatures.ports.out.ProductReadOutPort;

import java.util.List;

public class ProductReadUseCase implements ProductReadInPort {


    //Puerto de salida (Interfaz) (implementado por un puerto de salida)
    private ProductReadOutPort productReadOutPort;

    @Override
    public List<Product> findAll() {
        return productReadOutPort.findAll();
    }

    @Override
    public List<Product> findAllByCategory(String category) {
        return productReadOutPort.findAllByCategory(category);
    }
}

package com.example.hexagonalarchitecturefeatures.core.usecases;

import com.example.hexagonalarchitecturefeatures.core.domain.Product;
import com.example.hexagonalarchitecturefeatures.ports.in.ProductWriteInPort;
import com.example.hexagonalarchitecturefeatures.ports.out.ProductWriteOutPort;

import java.time.LocalDateTime;

public class ProductWriteUseCase implements ProductWriteInPort {


    private ProductWriteOutPort productWriteOutPort;

    public ProductWriteUseCase(ProductWriteOutPort productWriteOutPort) {
        this.productWriteOutPort = productWriteOutPort;
    }

    @Override
    public Product save(Product product) {
        product.setCreationDate(LocalDateTime.now());
        Double totalCost = calculateProductCost(product);
        product.setCost(totalCost);
        return productWriteOutPort.save(product);
    }

    private Double calculateProductCost(Product product) {
        Double iva = product.getPrice() * 0.21;
        Double cost = product.getPrice() - iva;
        Double margin = cost - cost * 0.10;

        return product.getPrice() - iva - margin;
    }

    @Override
    public Product update(Product product) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}

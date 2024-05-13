package com.example.hexagonalarchitecturefeatures.adapters.out.persistence.sqldatabase.springdatajpa;

import com.example.hexagonalarchitecturefeatures.core.domain.Product;
import com.example.hexagonalarchitecturefeatures.ports.out.ProductReadOutPort;
import com.example.hexagonalarchitecturefeatures.ports.out.ProductWriteOutPort;

import java.util.List;

public class ProductDao implements ProductReadOutPort, ProductWriteOutPort {


    private ProductEntityRepository productEntityRepository;

    public ProductDao(ProductEntityRepository productEntityRepository) {
        this.productEntityRepository = productEntityRepository;
    }

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

    @Override
    public Product save(Product product) {
        ProductEntity entity = ProductEntityMapper.of(product);
        productEntityRepository.save(entity);
        return ProductEntityMapper.of(entity);
    }

    @Override
    public Product update(Product product) {
        //ProductEntity entity = productEntityRepository.of(product);
        //productEntityRepository.up

        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}

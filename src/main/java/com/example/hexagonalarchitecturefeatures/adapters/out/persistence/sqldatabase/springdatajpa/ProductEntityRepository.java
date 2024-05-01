package com.example.hexagonalarchitecturefeatures.adapters.out.persistence.sqldatabase.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductEntityRepository extends JpaRepository<ProductEntity, Long> {


    List<ProductEntity> findAllByCategory(String category);

}
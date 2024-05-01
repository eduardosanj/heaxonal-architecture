package com.example.hexagonalarchitecturefeatures.ports.in;

/*

Metodos de búsqueda  / lectura de productos

 */


import com.example.hexagonalarchitecturefeatures.core.domain.Product;

import java.util.List;

public interface ProductReadInPort {

    List<Product> findAll();

    List<Product> findAllByCategory(String category);


}

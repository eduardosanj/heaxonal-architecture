package com.example.hexagonalarchitecturefeatures.adapters.in.api.rest;


import com.example.hexagonalarchitecturefeatures.core.domain.Product;
import com.example.hexagonalarchitecturefeatures.ports.in.ProductReadInPort;
import com.example.hexagonalarchitecturefeatures.ports.in.ProductWriteInPort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductRestController {

    //Puertos de entrada al hexágono (interface)
    private ProductReadInPort productReadInPort;
    private ProductWriteInPort productWriteInPort;

    public ProductRestController(ProductReadInPort productReadInPort, ProductWriteInPort productWriteInPort) {
        this.productReadInPort = productReadInPort;
        this.productWriteInPort = productWriteInPort;
    }

    @GetMapping("/api/products")
    public List<ProductDTO> findAll() {

        return this.productReadInPort.findAll().stream()
                .map(ProductWebMapper::of)
                .toList();
    }


    @GetMapping("/api/products/category/{category}")
    public List<ProductDTO> findAll(@PathVariable String category) {

        return this.productReadInPort.findAllByCategory(category).stream()
                .map(ProductWebMapper::of)
                .toList();

    }

    @PostMapping("/api/products")
    public ResponseEntity<ProductDTO> save(@RequestBody ProductDTO productDTO) {
        Product productDB = this.productWriteInPort.save(ProductWebMapper.of(productDTO));
        return ResponseEntity.ok(ProductWebMapper.of(productDB));

    }

}

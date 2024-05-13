package com.example.hexagonalarchitecturefeatures.config;


import com.example.hexagonalarchitecturefeatures.adapters.out.persistence.sqldatabase.springdatajpa.ProductDao;
import com.example.hexagonalarchitecturefeatures.adapters.out.persistence.sqldatabase.springdatajpa.ProductEntityRepository;
import com.example.hexagonalarchitecturefeatures.core.usecases.ProductReadUseCase;
import com.example.hexagonalarchitecturefeatures.core.usecases.ProductWriteUseCase;
import com.example.hexagonalarchitecturefeatures.ports.in.ProductReadInPort;
import com.example.hexagonalarchitecturefeatures.ports.in.ProductWriteInPort;
import com.example.hexagonalarchitecturefeatures.ports.out.ProductReadOutPort;
import com.example.hexagonalarchitecturefeatures.ports.out.ProductWriteOutPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Clase para configurar la inyección de beans con Spring
 * */
@Configuration
public class CDIConfig {

    @Bean
    public ProductDao productDao(ProductEntityRepository productEntityRepository){
        return new ProductDao(productEntityRepository);
    }

    @Bean
    public ProductReadInPort productReadUseCase(ProductReadOutPort productReadOutPort) {
        return new ProductReadUseCase(productReadOutPort);
    }
    @Bean
    public ProductWriteInPort productWriteUseCase (ProductWriteOutPort productWriteOutPort) {
        return new ProductWriteUseCase(productWriteOutPort);
    }



}

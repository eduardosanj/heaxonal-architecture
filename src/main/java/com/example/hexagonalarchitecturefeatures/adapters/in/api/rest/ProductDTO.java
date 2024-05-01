package com.example.hexagonalarchitecturefeatures.adapters.in.api.rest;

import java.time.LocalDateTime;

public record ProductDTO (Long id, String name, String category, Double price, Integer stock){
}

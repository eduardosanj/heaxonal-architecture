package com.example.hexagonalarchitecturefeatures.adapters.out.persistence.sqldatabase.springdatajpa;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name="products")
public class ProductEntity implements Serializable {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(unique = true)
        private String name;
        private String category;
        private Double price;
        private Integer stock;
        private Double cost;
        private LocalDateTime creationDate;

        public ProductEntity() {
        }

        public ProductEntity(Long id, String name, String category, Double price, Integer stock, Double cost, LocalDateTime creationDate) {
                this.id = id;
                this.name = name;
                this.category = category;
                this.price = price;
                this.stock = stock;
                this.cost = cost;
                this.creationDate = creationDate;
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getCategory() {
                return category;
        }

        public void setCategory(String category) {
                this.category = category;
        }

        public Double getPrice() {
                return price;
        }

        public void setPrice(Double price) {
                this.price = price;
        }

        public Integer getStock() {
                return stock;
        }

        public void setStock(Integer stock) {
                this.stock = stock;
        }

        public Double getCost() {
                return cost;
        }

        public void setCost(Double cost) {
                this.cost = cost;
        }

        public LocalDateTime getCreationDate() {
                return creationDate;
        }

        public void setCreationDate(LocalDateTime creationDate) {
                this.creationDate = creationDate;
        }
}

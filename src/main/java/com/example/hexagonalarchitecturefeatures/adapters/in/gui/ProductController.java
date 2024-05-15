package com.example.hexagonalarchitecturefeatures.adapters.in.gui;


import com.example.hexagonalarchitecturefeatures.core.domain.Product;
import com.example.hexagonalarchitecturefeatures.ports.in.ProductReadInPort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {

    private ProductReadInPort productReadInPort;

    public ProductController(ProductReadInPort productReadInPort) {
        this.productReadInPort = productReadInPort;
    }

    @GetMapping("/products")
    public String findAll(Model model){
            List<Product> products = this.productReadInPort.findAll();
            model.addAttribute("products", products);
            return "product-list";
        }


}

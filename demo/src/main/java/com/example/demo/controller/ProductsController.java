package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductsController {

    private final ProductService productService;

    public ProductsController(ProductService productService){
        this.productService = productService;
    }

    // 특정 경로에 대한 HTTP Get 요청을 컨틀롤러 액션과 매핑
    @GetMapping("/products")
    public String viewProducts(Model model){
        var products = productService.findAll();
        model.addAttribute("products", products);

        return "products.html";
    }

    // 특정 경로에 대한 HTTP Post 요청을 컨트롤러 액션과 매핑
    @PostMapping("/products")
    public String addProduct(
            Product p,
            Model model
    ){
        productService.addProduct(p);

        var products = productService.findAll();
        model.addAttribute("products", products);

        return "products.html";
    }
}

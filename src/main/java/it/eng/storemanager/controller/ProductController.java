package it.eng.storemanager.controller;

import it.eng.storemanager.model.Product;
import it.eng.storemanager.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping
    public List<Product> findAllProducts() {

    }

    @PutMapping
    public Product updateProduct(@RequestBody Product product) {

    }

    @GetMapping("{id}")
    public Product findProductById(@PathVariable int id) {

    }
    
    @DeleteMapping("{id}")
    public String deleteProduct(@PathVariable int id) {

    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {

    }
}

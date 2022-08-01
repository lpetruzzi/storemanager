package it.eng.storemanager.service;

import it.eng.storemanager.model.Product;
import it.eng.storemanager.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public Product method1(Product product) {
        try {
            return repository.save(product);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Product> method2() {
        return repository.getAllProducts();
    }

    public Product method3(int id) {
        return repository.findById(id);
    }

    public String method4(int id) {
        repository.delete(id);
        return "product removed !! " + id;
    }

    public Product method5(Product product) {
        return repository.update(product);
    }
}

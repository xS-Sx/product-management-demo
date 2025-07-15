package com.xss.demo.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
    
    public Product getProductById(Long id){
        return productRepository.findById(id).orElse(null);
    }
    
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Product updatedProduct){
        return productRepository.save(updatedProduct);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}

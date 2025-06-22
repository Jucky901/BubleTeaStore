package com.bubletea.store.service;

import com.bubletea.store.model.Product;
import com.bubletea.store.model.Category;
import com.bubletea.store.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> getProductsByCategoryId(Integer categoryId) {
        return productRepository.findByCategory_CategoryId(categoryId);
    }

    // 🔹 Use this when you already have a Category object
    public List<Product> getProductsByCategory(Category category) {
        return productRepository.findByCategory(category);
    }
}

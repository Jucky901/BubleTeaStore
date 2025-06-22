package com.bubletea.store.controller;

import com.bubletea.store.model.Category;
import com.bubletea.store.model.Product;
import com.bubletea.store.service.CategoryService;
import com.bubletea.store.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService; // needed if you use Category object

    // 🔹 Get all products
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    // 🔹 Get products by category ID
    @GetMapping("/by-category-id/{categoryId}")
    public List<Product> getProductsByCategoryId(@PathVariable Integer categoryId) {
        return productService.getProductsByCategoryId(categoryId);
    }

    // 🔹 Get products by Category object (not common for REST API, but possible)
    @GetMapping("/by-category/{categoryId}")
    public List<Product> getProductsByCategory(@PathVariable Integer categoryId) {
        Category category = categoryService.getCategoryById(categoryId);
        return productService.getProductsByCategory(category);
    }
}

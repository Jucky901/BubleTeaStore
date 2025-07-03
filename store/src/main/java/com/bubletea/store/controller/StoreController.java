package com.bubletea.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bubletea.store.model.Category;
import com.bubletea.store.model.Product;
import java.util.List;
import com.bubletea.store.service.CategoryService;
import com.bubletea.store.service.ProductService;

@Controller
public class StoreController {
    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ProductService productService;

    @GetMapping("/store")
    public String store(Model model){
        Integer defaultID = 1;
        List<Category> categories = categoryService.getAllCategories();
        List<Product> products = productService.getProductsByCategoryId(defaultID);



        
        model.addAttribute("categoryList", categories);
        model.addAttribute("productList", products);
        model.addAttribute("activeCategoryID", defaultID);
        
        
        return "store";
    }

    @GetMapping("/store/{categoryId}")
    public String storeByCategory(@PathVariable Integer categoryId, Model model) {
        List<Category> categories = categoryService.getAllCategories();
        List<Product> products = productService.getProductsByCategoryId(categoryId);

        model.addAttribute("categoryList", categories);
        model.addAttribute("productList", products);

        return "store";
    }
}

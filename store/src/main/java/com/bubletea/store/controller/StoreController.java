package com.bubletea.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.bubletea.store.model.Category;
import java.util.List;
import com.bubletea.store.service.CategoryService;

@Controller
public class StoreController {
    @Autowired
    private CategoryService categoryService;
    @GetMapping("/store")
    public String store(Model model){
        List<Category> categories = categoryService.getAllCategories();
        model.addAttribute("categoryList", categories);
        return "store";
    }
}

package com.bubletea.store.controller;
 
import com.bubletea.store.service.BillService;
import com.bubletea.store.model.*;
import java.util.List;
import java.util.


@Controller
public class BillController {
    @Autowired
    private BillService billService;
    @GetMapping("/bills")
    public String bill(Model model){
        List<Category> categories = categoryService.getAllCategories();
        
        model.addAttribute("categoryList", categories);
        model.addAttribute("productList", products);
        model.addAttribute("activeCategoryID", defaultID);
        System.
        
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

package com.bubletea.store.controller;

import org.aspectj.internal.lang.annotation.ajcDeclareParents;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bubletea.store.model.Bill;
import com.bubletea.store.model.Product;
import com.bubletea.store.service.ProductService;
import com.bubletea.store.service.BillService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CartController {
    @Autowired
    private BillService billService;

    @Autowired
    private ProductService productService;
    @GetMapping("/cart")
    public String cart(Model model)
    {
        Product product1 = new Product();

        product1.setProductId(1);
        product1.setName("test1");
        product1.setQuantity(1);
        product1.setPrice(new BigDecimal("10"));
        
        Product product2 = new Product();

        product2.setProductId(2);
        product2.setName("test2");
        product2.setQuantity(5);
        product2.setPrice(new BigDecimal("15"));

        List <Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        model.addAttribute("productList", productList);
        return "cart";

    }

    @PostMapping("/cart/submit")
    public String handleSubmit(@RequestParam("Bill_Id") String orderId, RedirectAttributes redirectAttributes) {
        Bill submitted_Bill = new Bill();
        Integer bill_id = Integer.valueOf(orderId.replace("Bill #",""));


        submitted_Bill.setBillId(bill_id);
        billService.saveBill(submitted_Bill);

        redirectAttributes.addFlashAttribute("successMessage",
        "Order " + orderId + " was submitted successfully!");

        return "redirect:/cart";
        
    }



}

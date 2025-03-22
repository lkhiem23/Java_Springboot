package com.devmaster.lesson07.controller;

import com.devmaster.lesson07.entity.Product;
import com.devmaster.lesson07.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public String ListProduct(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "product/product_list";
    }
    // CREATE
    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("product", new Product());
        return "product/product_form";
    }
    // SỬA
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") Long id, Model model) {
        model.addAttribute("product",productService.getProductById(id).orElse(null));
        return "product/product_form";
    }

    @PostMapping("/create")
    public String saveProduct(@ModelAttribute("product") Product product) {
        productService.saveProduct(product);
        return "redirect:/product";
    }

    @PostMapping("/create/{id}")
    public String updateProduct(@PathVariable Long id, @ModelAttribute Product product) {
        product.setId(id);
        productService.saveProduct(product);
        return "redirect:/product";
    }
// Delete
    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productService.deleteProductById(id);
        return "redirect:/product";
    }

}

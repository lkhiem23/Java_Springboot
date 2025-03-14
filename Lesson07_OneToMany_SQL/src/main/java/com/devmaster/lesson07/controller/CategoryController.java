package com.devmaster.lesson07.controller;

import com.devmaster.lesson07.entity.Category;
import com.devmaster.lesson07.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/category")

public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public String listCategories(Model model) {
        model.addAttribute("categories", categoryService.getAllCategories());
        return "category/category_list";
    }
// Tạo mới
    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("categories", new Category());
        return "category/category_form";
    }
// Sửa
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") Long id, Model model) {
        model.addAttribute("category",categoryService.getCategoryById(id).orElse(null));
        return "category/category_form";
    }

    @PostMapping("/create")
    public String saveCategory(@ModelAttribute("category") Category category) {
        categoryService.saveCategory(category);
        return "redirect:/category";
    }
// Update
    @PostMapping("/create/{id}")
    public String updateCategory(@PathVariable Long id, @ModelAttribute Category category) {
        category.setId(id);
        categoryService.saveCategory(category);
        return "redirect:/category";
    }
// Delete
    @GetMapping("/delete/{id}")
    public String deleteCategory(@PathVariable Long id) {
        categoryService.deleteCategoryById(id);
        return "redirect:/category";
    }

}

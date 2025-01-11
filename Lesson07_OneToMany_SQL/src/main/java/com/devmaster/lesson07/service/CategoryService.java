package com.devmaster.lesson07.service;

import com.devmaster.lesson07.entity.Category;
import com.devmaster.lesson07.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    //Lấy danh sách
    public List<Category> getAllCategories() {
        List<Category> categories = categoryRepository.findAll();
        System.out.println(categories);
        return categories;
    }

    // Lấy Category theo id
    public Optional<Category> getCategoryById(Long id) {
        return categoryRepository.findById(id);
    }

    // Cập nhật dữ liệu bảng category: create / update
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    // Xóa category theo id
    public void deleteCategoryById(Long id) {
        categoryRepository.deleteById(id);
    }
}

package com.devmaster.lesson07.service;

import com.devmaster.lesson07.entity.Product;
import com.devmaster.lesson07.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Lấy toàn bộ dữ liệu của bảng Product
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Đọc dữ liệu bảng Product theo id
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    // Cập nhật: create / update
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    // Xóa product theo id
    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }



}

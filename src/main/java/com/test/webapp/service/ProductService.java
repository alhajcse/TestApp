package com.test.webapp.service;

import com.test.webapp.model.Product;
import com.test.webapp.model.User;
import com.test.webapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public Product saveProduct(Product teacherInformation) {

        return  productRepository.save(teacherInformation);
    }

    public Optional<Product> getProductById(Integer id) {

        return productRepository.findById(id);
    }


    public List<Product> getProductAll() {

        return (List<Product>) productRepository.findAll();
    }


}

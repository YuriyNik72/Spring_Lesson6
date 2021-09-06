package com.nikitin.spring_lesson6.service;


import com.nikitin.spring_lesson6.entity.Product;
import com.nikitin.spring_lesson6.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {


    private ProductRepository productRepository;

    @Autowired
   public void setProductRepository(ProductRepository productRepository){
        this.productRepository = productRepository;

    }

    public List<Product> getProduct() {
        return productRepository.getProduct();
    }

    public List<Product> getMinProduct() {
        return productRepository.getMinProduct();
    }

    public List<Product> getMaxProduct() {
        return productRepository.getMaxProduct();
    }

    public List<Product> getMinAndMaxProduct() {
        return productRepository.getMinAndMaxProduct();
    }

    public List<Product> getProductByPage(int pageNum) {
        return productRepository.getProductByPage(pageNum);
    }
}

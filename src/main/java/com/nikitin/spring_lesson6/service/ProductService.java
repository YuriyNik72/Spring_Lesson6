package com.nikitin.spring_lesson6.service;


import com.nikitin.spring_lesson6.entity.Product;
import com.nikitin.spring_lesson6.repositories.PageRepository;
import com.nikitin.spring_lesson6.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class ProductService {


    private ProductRepository productRepository;
    private PageRepository pageRepository;

    @Autowired
   public void setProductRepository(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    @Autowired
    public void setPageRepository(PageRepository pageRepository){
        this.pageRepository=pageRepository;
    }

    public List<Product> getProduct() {
        return productRepository.findAll();
    }

    public List<Product> getMinProduct(int min) {
        return productRepository.findAllByPriceLessThanOderByPrice(min);
    }

    public List<Product> getMaxProduct(int max) {
        return productRepository.findAllByPriceGreaterThanOrderByPrice(max);
    }

    public List<Product> getProductByPage(int pageNum) {
        Page<Product> pr= pageRepository.findAll(PageRequest.of(pageNum,5));
        return pr.stream().collect(Collectors.toList());
    }

    public List<Product> getMinAndMaxProduct(int min, int max) {
        return productRepository.findAllByPriceBetweenOrderByPrice(min,max);
    }
}

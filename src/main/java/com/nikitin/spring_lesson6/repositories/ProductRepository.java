package com.nikitin.spring_lesson6.repositories;

import com.nikitin.spring_lesson6.entity.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Component
@Repository
public class ProductRepository{

    public List<Product> getProduct(){
        return new ArrayList<>();
    }

    public List<Product> getMinProduct(){
        return new ArrayList<>();
    }

    public List<Product> getMaxProduct(){
        return new ArrayList<>();
    }

    public List<Product> getMinAndMaxProduct(){
        return new ArrayList<>();
    }

    public List<Product> getProductByPage(int pageNum){
        return new ArrayList<>();
    }
}

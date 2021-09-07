package com.nikitin.spring_lesson6.repositories;

import com.nikitin.spring_lesson6.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

    public List<Product> findAll();


    public List<Product> findAllByPriceLessThanOderByPrice(int min);


    public List<Product> findAllByPriceGreaterThanOrderByPrice(int max);


    public List<Product> findAllByPriceBetweenOrderByPrice(int min, int max);

}

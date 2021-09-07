package com.nikitin.spring_lesson6.controllers;


import com.nikitin.spring_lesson6.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/")
public class ProductController {

    private ProductService service;

    @Autowired
    public void setProduct(ProductService service){
       this.service= service;
    }

    //  Показать весь список продуктов
    @GetMapping("/list")
    public String showProduct(Model uiModel) {
        uiModel.addAttribute("product", service.getProduct());
        return "products";
    }

    @GetMapping(path = "/minPrice")
    public String showMinProduct(Model uiModel, @RequestParam("min") int min) {
        uiModel.addAttribute("product",service.getMinProduct(min));
        return "products";
    }

    @GetMapping(path = "/maxPrice")
    public String showMaxPrice(Model uiModel, @RequestParam("max") int max){
            uiModel.addAttribute("product", service.getMaxProduct(max));
            return "products";
    }

    @GetMapping(path = "/minMaxPrice")
    public String showMinAndMaxProduct(Model uiModel, @RequestParam("min") int min, @RequestParam("max") int max) {
        uiModel.addAttribute("product", service.getMinAndMaxProduct(min,max));
        return "products";
    }

    @GetMapping(path = "/page")
    public String showProduct(Model uiModel, @RequestParam("pageNum") int pageNum){
        uiModel.addAttribute("product", service.getProductByPage(pageNum-1));
        return "products";
    }

}

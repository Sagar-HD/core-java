package com.sagar.app.configuration.component;

import com.sagar.app.configuration.dto.ProductDto;
import com.sagar.app.configuration.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class Product {

    @Autowired
    private ProductService productService;

    @RequestMapping("/product")
    public String product(ProductDto productDto, Model model) {
        System.out.println(productDto);
        model.addAttribute("message", "success");
        productService.validateAndSave(productDto);
        return "Product.jsp";
    }
}

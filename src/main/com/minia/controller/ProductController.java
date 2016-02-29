package com.minia.controller;

import com.minia.entity.Product;
import com.minia.service.products.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Ericyao
 * on 2/29/16.
 */

@Controller
@RequestMapping("")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/homepage")
    public String showItems(){
        ModelAndView temp = new ModelAndView();
        temp.addObject("sss",productService.getAllProducts());
        return "homepage";

    }

}

package com.minia.controller;

import com.minia.entity.Product;
import com.minia.entity.User;
import com.minia.service.products.ProductService;
import com.minia.service.users.UserService;
import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by duanyujia on 2/24/16.
 */
@Controller
@RequestMapping("/spring")
public class MainController {

    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;

    @RequestMapping("")
    public String home(){
        try{
            List<User> us = new ArrayList<User>();
            List<Product> ps = new ArrayList<Product>();
            for (int i = 0; i < 20; ++i){
                User u = new User();
                u.setUsername("user" + i);
                u.setUserPassword("user");
                u.setUserEmail("user" + i + "@gmail.com");
                us.add(u);
                userService.saveUsers(us);
            }
            for (int i = 0; i <20; ++ i){
                Product p = new Product();
                p.setpName("product" + i);
                p.setPrice(2.3333);
                ps.add(p);
                productService.saveProducts(ps);
            }
        }catch (HibernateException e){
            e.printStackTrace();
        }

        return "index";
    }

    @RequestMapping("/json")
    @ResponseBody
    public List<User> json(){
        return userService.getAllUsernames();
    }

}


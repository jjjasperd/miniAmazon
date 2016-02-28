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
import org.json.simple.JSONObject;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by duanyujia on 2/24/16.
 */
@Controller
@RequestMapping("")
public class MainController {

    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;

    @RequestMapping("/home")
    public void home(){
        try{
            List<User> us = new ArrayList<User>();
            List<Product> ps = new ArrayList<Product>();
            List<String> wl = new ArrayList<String>();
            for (int i = 0; i < 2; ++i){
                User u = new User();
                u.setUsername("userEric" + i);
                u.setUserPassword("user");
                u.setUserEmail("userEric" + i + "@gmail.com");

                wl.add("i");
                u.setWishlist(wl.toString());
                us.add(u);
                userService.saveUsers(us);
            }
            for (int i = 0; i <2; ++ i){
                Product p = new Product();
                p.setpName("product" + i);
                p.setPrice(2.3333);
                ps.add(p);
                productService.saveProducts(ps);
            }
        }catch (HibernateException e){
            e.printStackTrace();
        }

        //return "index";
    }

    @RequestMapping("/json")

    public List<User> json(){
        return userService.getAllUsernames();
    }


    @RequestMapping("/testWL")
    @ResponseBody
    public ModelAndView getWL(){


        System.out.println(userService.getWishList());

        ModelAndView temp = new ModelAndView();
        temp.addObject("sss",userService.getWishList());
            //system.out.println();
        return temp;
        //return temp;
    }







}


package com.minia.controller;

import com.minia.dao.productd.ProductDAO;
import com.minia.dao.userd.UserDAO;
import com.minia.entity.Product;
import com.minia.service.products.ProductService;
import com.minia.service.users.UserService;
import org.hibernate.validator.internal.util.privilegedactions.GetMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * Created by Ericyao
 * on 3/1/16.
 */

@Controller
@Scope("session")
@RequestMapping( "/")
public class HomeController {
    private ProductDAO pdd;
    private UserDAO us;

    @Autowired
    public HomeController(ProductDAO productdao,UserDAO userdao){
        pdd = productdao;
        us = userdao;

    }

    @RequestMapping(method = RequestMethod.GET)
    public String home(Model model){
        model.addAttribute("pddList",
                pdd.findAll()
        );


        return "homepage";
    }


    @RequestMapping(value = "/showPname",method = RequestMethod.POST)
    //@ResponseBody
    public ModelAndView processPname(@RequestParam("111") String name){
        ModelAndView mav = new ModelAndView();
        mav.addObject("fff",name);
        mav.setViewName("showProduct");

        return mav;
    }




    @RequestMapping(value = "/updateWL",method = RequestMethod.POST)
    public void updateWL(@RequestParam("111") String pid){
        int userid = 84;
        us.updateWL(userid,pid);
    }

}

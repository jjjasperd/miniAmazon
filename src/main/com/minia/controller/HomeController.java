package com.minia.controller;

import com.minia.dao.productd.ProductDAO;
import com.minia.entity.Product;
import com.minia.service.products.ProductService;
import org.hibernate.validator.internal.util.privilegedactions.GetMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Ericyao
 * on 3/1/16.
 */

@Controller
@RequestMapping( "/")
public class HomeController {
    private ProductDAO pdd;

    @Autowired
    public HomeController(ProductDAO productdao){
        pdd = productdao;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String home(Model model){
        model.addAttribute("pddList",
                pdd.findAll()
        );


        return "homepage";
    }

    @RequestMapping(value = "/{name}",method = RequestMethod.GET)
    public String showPname(@PathVariable String name, Model model){
       return "showProduct";
    }

    @RequestMapping(value = "/showPname",method = RequestMethod.POST)
    public ModelAndView processPname(@RequestParam("111") String name){
        ModelAndView mav = new ModelAndView();
        mav.addObject("fff",name);
        mav.setViewName("showProduct");

        return mav;
    }

}

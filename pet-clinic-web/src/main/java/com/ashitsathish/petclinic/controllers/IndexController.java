package com.ashitsathish.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ashitsathish on Jul,2020
 */
@Controller
public class IndexController {
    @RequestMapping({"", "/", "/index", "/index.html"})
    public String indexPage(){
        System.out.println("test");
        return "index";
    }
}

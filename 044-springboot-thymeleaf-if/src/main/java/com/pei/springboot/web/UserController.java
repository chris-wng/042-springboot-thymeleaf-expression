package com.pei.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping(value = "/condition")
    public String condition(Model model) {

        model.addAttribute("sex",1);

        model.addAttribute("flag",true);

        model.addAttribute("productType","0");


        return "condition";
    }
}

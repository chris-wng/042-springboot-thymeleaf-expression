package com.pei.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class IndexController {


    @RequestMapping(value = "/index")
    public String index(Model model) {
        model.addAttribute("data","SpringBoot Thymeleaf");
        return "index";
    }

    @RequestMapping(value = "/index1")
    public ModelAndView index1() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        mv.addObject("data","SpringBoot");
        return mv;
    }
}

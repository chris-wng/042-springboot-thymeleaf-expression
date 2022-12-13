package com.pei.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping(value = "/inline")
    public String inline(Model model) {
        model.addAttribute("data","SpringBoot inline");
        return "inline-test";
    }
}

package com.pei.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


@Controller
public class UserController {

    @RequestMapping(value = "/index")
    public String index(HttpServletRequest request,Model model,Integer id) {

        model.addAttribute("username","lisi");
        request.getSession().setAttribute("data","sessionData");
        request.setAttribute("data" , "requestData");

        return "index";
    }
}

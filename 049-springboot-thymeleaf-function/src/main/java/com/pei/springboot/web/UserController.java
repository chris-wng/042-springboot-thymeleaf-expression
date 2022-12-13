package com.pei.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;


@Controller
public class UserController {

    @RequestMapping(value = "/function")
    public String function(Model model) {

        model.addAttribute("time",new Date());
        model.addAttribute("data","SpringBootHelloWorld");
        ArrayList list = new ArrayList();
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        model.addAttribute("list",list);
        model.addAttribute("number"  ,190);
        return "function";
    }
}

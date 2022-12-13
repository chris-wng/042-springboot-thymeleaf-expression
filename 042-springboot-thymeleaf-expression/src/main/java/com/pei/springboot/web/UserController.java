package com.pei.springboot.web;

import com.pei.springboot.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


@Controller
public class UserController {

    @RequestMapping(value = "/user/detail")
    public ModelAndView userDetail() {
        ModelAndView mv = new ModelAndView();
        User user = new User();
        user.setId(1001);
        user.setAge(23);
        user.setUsername("lisi");
        mv.setViewName("userDetail");
        mv.addObject("user",user);
        return mv;
    }

    @RequestMapping(value = "/user/detail2")
    public String userDetail1(Model model, HttpServletRequest request) {
        User user = new User();
        user.setId(1002);
        user.setAge(24);
        user.setUsername("王五");
        model.addAttribute("user",user);
        //request.setAttribute("user" , user);
        return "userDetail";
    }

    @RequestMapping(value = "/url")
    public String urlExpression(Model model) {

        model.addAttribute("id",1001);
        model.addAttribute("age",28);
        model.addAttribute("username","zhaoliu");

        return "url";
    }


    @RequestMapping(value = "/test")
    public @ResponseBody String test(String username) {
        return "请求路径/test,参数是:" + username;
    }

    @RequestMapping(value = "/test1")
    public @ResponseBody String test1(Integer id,String username,Integer age) {
        return "请求路径/test1,参数id=" + id+",username="+username+",age="+age;
    }

    @RequestMapping(value = "/test2/{id}")
    public @ResponseBody String test2(@PathVariable("id") Integer id) {
        return "ID="+id;
    }

    @RequestMapping(value = "/test3/{id}/{username}")
    public @ResponseBody String test3(@PathVariable("id") Integer id,
                                      @PathVariable("username") String username) {
        return "ID="+id+"----username="+username;
    }

    @RequestMapping(value = "/url2")
    public String url2() {
        return "url2";
    }

    @RequestMapping(value = "/property")
    public String property(Model model) {
        model.addAttribute("title" , "小明");
        model.addAttribute("color" , "red");
        model.addAttribute("email" , "123@qq.com");
        return "property";
    }
}

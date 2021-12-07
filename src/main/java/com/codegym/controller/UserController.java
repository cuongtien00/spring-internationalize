package com.codegym.controller;

import com.codegym.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/users")
public class UserController {
    @GetMapping
    public ModelAndView demo(){
        ModelAndView modelAndView = new ModelAndView("/demo");
        modelAndView.addObject("user",new User());
        return modelAndView;
    }
    @GetMapping("/create")
    public ModelAndView createForm(){
        ModelAndView modelAndView  = new ModelAndView("/login");
        modelAndView.addObject("user",new User());
        return modelAndView;
    }
}

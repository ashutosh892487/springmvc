package com.stackroute.controller;

import com.stackroute.model.UserName;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LoginController {

    @GetMapping("/")
    public String getLoginForm(ModelMap map){
        return "loginForm";
    }

//    @PostMapping("/submit")
//
//    public String submit(ModelMap map , @ModelAttribute("user") UserName user){
//
//        map.addAttribute("greeting","welcome "+ user.getName()+" to stackroute");
//        return "index";
//    }
    @RequestMapping(value="/submit",method = RequestMethod.POST)
    public String submit(ModelMap Map,@ModelAttribute("user") UserName user){
        Map.addAttribute("greeting","welcome "+ user.getName()+" to stackroute");
        return "index";
    }

}
package com.example.demojsp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {


    @GetMapping("/login")
    public String  showLoginMessage(Model model){

        return "login";
    }

    @PostMapping("/login")
    public String  showWelcomePage(@RequestParam String name, Model model){

        model.addAttribute("name", name);

        return "welcome";
    }
}

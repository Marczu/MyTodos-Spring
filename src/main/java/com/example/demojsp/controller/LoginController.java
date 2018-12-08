package com.example.demojsp.controller;


import com.example.demojsp.service.LoginService;
import com.example.demojsp.service.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

    @GetMapping("/login")
    public String showLoginMessage(Model model) {

        return "login";
    }

    @PostMapping("/login")
    public String showWelcomePage(@RequestParam String name,
                                  @RequestParam String password,
                                  Model model) {

        boolean isValidUser = loginService.validateUser(name, password);

        if (!isValidUser) {
            model.addAttribute("message", "Invalid Credentials");
            return "login";
        }

        model.addAttribute("name", name);
        model.addAttribute("password", password);

        return "welcome";
    }
}

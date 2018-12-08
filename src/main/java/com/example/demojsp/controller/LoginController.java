package com.example.demojsp.controller;


import com.example.demojsp.service.LoginService;
import com.example.demojsp.service.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {

    @Autowired
    LoginService loginService;

    @GetMapping("/login")
    public String showLoginMessage(ModelMap model) {

        return "login";
    }

    @PostMapping("/login")
    public String showWelcomePage(@RequestParam String name,
                                  @RequestParam String password,
                                  ModelMap model) {

        boolean isValidUser = loginService.validateUser(name, password);

        if (!isValidUser) {
            model.put("message", "Invalid Credentials");
            return "login";
        }

        model.put("name", name);
        model.put("password", password);

        return "welcome";
    }
}

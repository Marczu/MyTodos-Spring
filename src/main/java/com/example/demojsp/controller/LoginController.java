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

    @GetMapping("/")
    public String showLoginMessage(ModelMap model) {
        model.put("name", "marczu");
        model.put("password", "123");
        return "welcome";
    }

}

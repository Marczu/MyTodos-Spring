package com.example.demojsp.controller;


import com.example.demojsp.service.LoginService;
import com.example.demojsp.service.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
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
        model.put("name", getLoggedInUserName());
        return "welcome";
    }

    private String getLoggedInUserName(){
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if(principal instanceof UserDetails){
            return ((UserDetails) principal).getUsername();
        }
        return principal.toString();
    }

}

package com.example.demojsp.service;

import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    public boolean validateUser(String userId, String password) {
        return userId.equalsIgnoreCase("marczu") & password.equalsIgnoreCase("123");
    }


}

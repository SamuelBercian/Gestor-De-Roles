package com.practica.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoginUserController {
    
    @GetMapping("/Login")
    public String ShowLogin(){
        return "SignUp&LogIn/Login";
    }
    
}

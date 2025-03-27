package com.practica.springboot.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.practica.springboot.model.User;
import com.practica.springboot.repository.UserRepository;
import com.practica.springboot.service.SignUpService;

@Controller
public class SignUpUserController {

    @Autowired
    private SignUpService signUpService;

    @GetMapping("/SignUp")
    public String ShowSignUp(){
        return "SignUp&LogIn/SignUp";
    }

    @PostMapping("/SignUp")
    public String registrarUsuario(@RequestParam String name, @RequestParam String lastname, @RequestParam int age, 
    @RequestParam String email, @RequestParam String password, RedirectAttributes redirectAttributes) throws IOException{

        signUpService.registrarUsuario(name, lastname, age, email, password, redirectAttributes);
        return "redirect:/Login";
    }
}

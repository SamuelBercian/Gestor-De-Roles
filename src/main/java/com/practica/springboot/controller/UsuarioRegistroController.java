package com.practica.springboot.controller;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// import com.practica.springboot.repository.UsuarioRepository;

@Controller
public class UsuarioRegistroController {
    
    // @Autowired
    // private UsuarioRepository usuarioRepository;

    @GetMapping("/SignUp")
    public String ShowSignUp(){
        return "SignUp&LogIn/SignUp";
    }
    
}

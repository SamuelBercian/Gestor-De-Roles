package com.practica.springboot.controller;

// s
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// import com.practica.springboot.repository.UserRepository;

@Controller
public class SignUpUserController {
    
    // @Autowired
    // private UserRepository userRepository;

    @GetMapping("/SignUp")
    public String ShowSignUp(){
        return "SignUp&LogIn/SignUp";
    }
    
}

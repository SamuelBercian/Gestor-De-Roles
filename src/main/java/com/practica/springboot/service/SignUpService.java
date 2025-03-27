package com.practica.springboot.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.practica.springboot.repository.UserRepository;
import com.practica.springboot.model.User;

@Service
public class SignUpService {
    
    @Autowired
    private UserRepository userRepository;

    // Registra un nuevo usuario
    public void registrarUsuario(String name, String lastname, int age, String email, String password, 
    RedirectAttributes redirectAttributes) throws IOException{
    
        User newUser = new User();

        newUser.setName(name);
        newUser.setLastname(lastname);
        newUser.setAge(age);
        newUser.setEmail(email);
        newUser.setPassword(password);

        userRepository.save(newUser);
    }
}

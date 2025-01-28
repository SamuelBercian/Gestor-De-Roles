package com.practica.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.practica.springboot.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}

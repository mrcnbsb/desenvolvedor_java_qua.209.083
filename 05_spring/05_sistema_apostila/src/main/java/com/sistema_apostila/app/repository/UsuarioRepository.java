package com.sistema_apostila.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema_apostila.app.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String>{
    Usuario findByLogin(String login);
}

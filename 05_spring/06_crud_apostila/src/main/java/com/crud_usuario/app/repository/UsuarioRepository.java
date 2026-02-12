package com.crud_usuario.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud_usuario.app.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {
    Usuario findByLogin(String login); // Método mágico do Spring Data
}

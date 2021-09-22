package com.example.login.config.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.login.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	public Usuario findByNome(String nome);
	
}
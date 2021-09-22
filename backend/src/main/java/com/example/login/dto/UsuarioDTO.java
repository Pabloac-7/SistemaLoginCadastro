package com.example.login.dto;

import java.io.Serializable;

import com.example.login.entities.Usuario;

public class UsuarioDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nome;
	private String senha;
	
	public UsuarioDTO() {
		
	}

	public UsuarioDTO(Integer id, String nome, String senha) {
		this.id = id;
		this.nome = nome;
		this.senha = senha;
	}
	
	public UsuarioDTO(Usuario entity) {
		id = entity.getId();
		nome = entity.getNome();
		senha = entity.getSenha();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}

package com.example.login.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.login.dto.UsuarioDTO;

@Entity
@Table(name ="tb_users")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(unique=true)
	private String nome;
	
	private String senha;
	
	public Usuario() {
		
	}

	public Usuario(Integer id, String nome, String senha) {
		this.id = id;
		this.nome = nome;
		this.senha = senha;
	}
	
	public Usuario(UsuarioDTO dto) {
		id = dto.getId();
		nome = dto.getNome();
		senha = dto.getSenha();
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

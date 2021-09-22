package com.example.login.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.login.config.repositories.UsuarioRepository;
import com.example.login.dto.UsuarioDTO;
import com.example.login.entities.Usuario;


import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	
	//Encoder disponibilizado pelo framework spring - Bcrypt
	private PasswordEncoder encoder = new BCryptPasswordEncoder();
	
	public List<UsuarioDTO> findALL(){
		List<Usuario> result = repository.findAll();
		return result.stream().map(x -> new UsuarioDTO(x)).collect(Collectors.toList());
	}
	
	public Boolean save(Usuario usuario) {	
		//olhar no banco se existe um usuario igual
		if(repository.findByNome(usuario.getNome())==null) {
			//usa a criptografia na senha antes de salvar no banco de dados
			//usuario.setSenha(getHashMd5(usuario.getSenha())); //MD5
			usuario.setSenha(encoder.encode(usuario.getSenha())); //BCrypt			
			repository.save(usuario);
			return true;
		}
		return false;
	}
	
	//Classe para hash md5
	public static String getHashMd5(String value) {
		MessageDigest md;
			try {
				md = MessageDigest.getInstance("MD5");
	        } catch (NoSuchAlgorithmException e) {
	            throw new RuntimeException(e);
	        }
	    BigInteger hash = new BigInteger(1, md.digest(value.getBytes()));
	    return hash.toString(16);
	}
	
	public Boolean validarUsuario(String nome, String senha) {
		Usuario user = repository.findByNome(nome);
		return (user==null) ? false : encoder.matches(senha, user.getSenha());
		//return (user==null);
	}
	public Boolean verificaCadastro(String nome) {
		return (repository.findByNome(nome)==null);
	}
}

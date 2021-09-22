package com.example.login.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.login.dto.UsuarioDTO;
import com.example.login.entities.Usuario;
import com.example.login.services.UsuarioService;

@RestController
@RequestMapping(value = "/users")
public class UsuarioController {
	
	@Autowired
	private UsuarioService service;

	@GetMapping(value="/list")
	public ResponseEntity<List<UsuarioDTO>> findAll(){
		List<UsuarioDTO> list = service.findALL();
		return ResponseEntity.ok(list);
	}
	
	@PostMapping(value="/save")
	public ResponseEntity<Boolean> insert(@RequestBody UsuarioDTO usuario) {	
		Boolean valid = service.save(new Usuario(usuario));
		HttpStatus status = (valid) ? HttpStatus.OK : HttpStatus.UNAUTHORIZED;
		return ResponseEntity.status(status).body(valid);
	}
	
	@GetMapping(value="/validar")
	public ResponseEntity<Boolean> validar(@RequestParam String nome, @RequestParam String senha){
		Boolean valid = service.validarUsuario(nome,senha);
		HttpStatus status = (valid) ? HttpStatus.OK : HttpStatus.UNAUTHORIZED;
		return ResponseEntity.status(status).body(valid);
	}
	
	@GetMapping(value="/validarCad")
	public ResponseEntity<Boolean> validarCad(@RequestParam String nome){
		Boolean valid = service.verificaCadastro(nome);
		HttpStatus status = (valid) ? HttpStatus.OK : HttpStatus.UNAUTHORIZED;
		return ResponseEntity.status(status).body(valid);
	}
	
}

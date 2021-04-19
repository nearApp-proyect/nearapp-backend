package com.backend.nearapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.backend.nearapp.model.Usuario;
import com.backend.nearapp.services.UsuarioServices;

@RestController
@RequestMapping(value="/user")
public class UsuarioController {

	@Autowired
	UsuarioServices userService;
	
	
	@RequestMapping(method=RequestMethod.GET, path="/all")
	public ResponseEntity<List<Usuario>> getAllUsers(){
		try{
			return ResponseEntity.ok(userService.getAllUsers());
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(method = RequestMethod.GET, path="/{nickname}")
	public ResponseEntity<Usuario> getUser(@PathVariable(value="nickname") String nickname){
		try{
			return ResponseEntity.ok(userService.getUserByNickname(nickname));
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(method = RequestMethod.POST,path="/new")
	public ResponseEntity<Usuario> saveUser(@RequestBody Usuario user){
		try{
			userService.addUser(user);
			return new ResponseEntity<>(HttpStatus.CREATED);
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}

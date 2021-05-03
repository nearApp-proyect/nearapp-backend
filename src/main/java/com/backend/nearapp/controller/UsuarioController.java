package com.backend.nearapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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
	
	@CrossOrigin(origins={"http://localhost:3000","https://frontendnearapp.herokuapp.com/"})
	@RequestMapping(method=RequestMethod.GET, path="/all")
	public ResponseEntity<List<Usuario>> getAllUsers(){
		try{
			return ResponseEntity.ok(userService.getAllUsers());
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@CrossOrigin(origins={"http://localhost:3000","https://frontendnearapp.herokuapp.com/"})
	@RequestMapping(method = RequestMethod.GET, path="/{nickname}")
	public ResponseEntity<Usuario> getUser(@PathVariable(value="nickname") String nickname){
		try{
			return ResponseEntity.ok(userService.getUserByNickname(nickname));
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@CrossOrigin(origins={"http://localhost:3000","https://frontendnearapp.herokuapp.com/"})
	@RequestMapping(method = RequestMethod.POST,path="/new")
	public ResponseEntity<Usuario> saveUser(@RequestBody Usuario user){
		try{
			
			return ResponseEntity.ok(userService.addUser(user));
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@CrossOrigin(origins={"http://localhost:3000","https://frontendnearapp.herokuapp.com/"})
	@RequestMapping(method= RequestMethod.PUT, path="/update")
	public ResponseEntity<Usuario> updateUser(@RequestBody Usuario user){
		try{
			
			return ResponseEntity.ok(userService.modifyUser(user));
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@CrossOrigin(origins={"http://localhost:3000","https://frontendnearapp.herokuapp.com/"})
	@RequestMapping(method = RequestMethod.GET, path="/login/{nickname}/{password}")
	public ResponseEntity<Usuario> Login(@PathVariable(value="nickname") String nickname,@PathVariable(value="password") String password){
		try{
			return ResponseEntity.ok(userService.Login(nickname, password));
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/test")
	public ResponseEntity<String> getTesting() {
			return ResponseEntity.ok("Controladores correctos");
	}
}

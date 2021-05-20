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

import com.backend.nearapp.model.Publicacion;
import com.backend.nearapp.services.PublicacionServices;

@RestController
@RequestMapping(value="/publicacion")
public class PublicacionController {

	@Autowired
	PublicacionServices PubliServ;
	
	@CrossOrigin(origins={"http://localhost:3000","https://frontendnearapp.herokuapp.com/"})
	@RequestMapping(method = RequestMethod.POST,path="/new")
	public ResponseEntity<Publicacion> savePublicacion(@RequestBody Publicacion publicacion){
		try{
			return ResponseEntity.ok(PubliServ.savePublication(publicacion));
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@CrossOrigin(origins={"http://localhost:3000","https://frontendnearapp.herokuapp.com/"})
	@RequestMapping(method = RequestMethod.PUT,path="/update")
	public ResponseEntity<Publicacion> updatePublicacion(@RequestBody Publicacion publicacion){
		try{
			return ResponseEntity.ok(PubliServ.updatePublication(publicacion));
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@CrossOrigin(origins={"http://localhost:3000","https://frontendnearapp.herokuapp.com/"})
	@RequestMapping(method = RequestMethod.GET,path="/user/{id}")
	public ResponseEntity<List<Publicacion>> getAllPublicacionUser(@PathVariable(value="id") String nickname){
		try{
			return ResponseEntity.ok(PubliServ.getAllPublicacionUser(nickname));
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@CrossOrigin(origins={"http://localhost:3000","https://frontendnearapp.herokuapp.com/"})
	@RequestMapping(method = RequestMethod.GET,path="/categoria/{id}")
	public ResponseEntity<List<Publicacion>> getAllPublicacionCateg(@PathVariable(value="id") int categoria){
		try{
			return ResponseEntity.ok(PubliServ.getAllPublicacionCateg(categoria));
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@CrossOrigin(origins={"http://localhost:3000","https://frontendnearapp.herokuapp.com/"})
	@RequestMapping(method = RequestMethod.GET,path="/normal")
	public ResponseEntity<List<Publicacion>> getAllPublicacionNormal(){
		try{
			return ResponseEntity.ok(PubliServ.getAllPublicacionNormal());
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@CrossOrigin(origins={"http://localhost:3000","https://frontendnearapp.herokuapp.com/"})
	@RequestMapping(method = RequestMethod.GET,path="/rapida")
	public ResponseEntity<List<Publicacion>> getAllPublicacionRapida(){
		try{
			return ResponseEntity.ok(PubliServ.getAllPublicacionRapida());
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
}

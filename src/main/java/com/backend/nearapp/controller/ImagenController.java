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

import com.backend.nearapp.model.Imagen;
import com.backend.nearapp.model.Publicacion;
import com.backend.nearapp.services.ImagenServices;

@RestController
@RequestMapping(value="/imagen")
public class ImagenController {
	
	@Autowired
	ImagenServices imgServ;
	
	@CrossOrigin(origins={"http://localhost:3000","https://frontendnearapp.herokuapp.com/"})
	@RequestMapping(method = RequestMethod.POST,path="/new")
	public ResponseEntity<Imagen> saveImagen(@RequestBody Imagen imagen){
		try{
			return ResponseEntity.ok(imgServ.saveImagen(imagen));
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@CrossOrigin(origins={"http://localhost:3000","https://frontendnearapp.herokuapp.com/"})
	@RequestMapping(method = RequestMethod.GET,path="/all/{id}")
	public ResponseEntity<List<Imagen>> getAllImagen(@PathVariable(value="id") int id){
		try{
			return ResponseEntity.ok(imgServ.getImagenByPub(id));
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}

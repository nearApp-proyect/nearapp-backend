package com.backend.nearapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.backend.nearapp.model.Categoria;
import com.backend.nearapp.services.CategoriaServices;

@RestController
@RequestMapping(value="/categoria")
public class CategoriaController {

	@Autowired
	CategoriaServices categoriaServ;
	
	@CrossOrigin(origins={"http://localhost:3000","https://frontendnearapp.herokuapp.com/"})
	@RequestMapping(method=RequestMethod.GET, path="/all")
	public ResponseEntity<List<Categoria>> getAllCategorias(){
		try{
			return ResponseEntity.ok(categoriaServ.getCategorias());
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}

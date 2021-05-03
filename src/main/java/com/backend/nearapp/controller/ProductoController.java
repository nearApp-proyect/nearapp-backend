package com.backend.nearapp.controller;

import java.util.List;

import com.backend.nearapp.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.backend.nearapp.services.ProductoServices;

@RestController
@RequestMapping(value="/producto")
public class ProductoController {
	
	@Autowired
	ProductoServices productoSev;
	
	@CrossOrigin(origins={"http://localhost:3000","https://frontendnearapp.herokuapp.com/"})
	@RequestMapping(method=RequestMethod.GET,path="/category/{id}")
	public ResponseEntity<List<Producto>> getProductos(@PathVariable(name="id") int id){
		try{
			return ResponseEntity.ok(productoSev.getProductobyCategoria(id)); 
		}catch(Exception e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}

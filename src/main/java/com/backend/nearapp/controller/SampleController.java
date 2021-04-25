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

@RestController
@RequestMapping(value="/sample")
public class SampleController {
		
	@RequestMapping(method=RequestMethod.GET, path="/greeting")
	public ResponseEntity<String> getGreeting() {
			return ResponseEntity.ok("Hello");
	}
}

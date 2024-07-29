package edu.dio.studer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.dio.studer.dto.PomoDTO;
import edu.dio.studer.models.Pomo;
import edu.dio.studer.service.PomoService;

@RestController
@RequestMapping(value="/pomos")
public class PomoController {
	
	@Autowired
	private PomoService pomoServ;
	
	@PostMapping
	ResponseEntity<Pomo> create(@RequestBody PomoDTO dto){
		Pomo createdPomo = pomoServ.create(dto);
		
		return new ResponseEntity<>(createdPomo, HttpStatus.CREATED);
	}
}

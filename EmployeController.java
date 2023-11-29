package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Employe;
import com.example.demo.repositories.EmployeRepository;

@RestController
@RequestMapping("/api/v1")
//Succes Aravind it's working fine now
//Third Commit Message 
//Pull Command working fine
//pull Second time
//latest Changes
//Git Stash
public class EmployeController {

	@Autowired
	private EmployeRepository employeRepository;
	
	@PostMapping("/employe")
	public ResponseEntity<Employe> onboardEmploye(@RequestBody Employe employe){
		Employe savedEmploye= employeRepository.save(employe);
		
		return new ResponseEntity<Employe>(savedEmploye, HttpStatus.OK);
	}
	
	
	@GetMapping("/employes")
	public ResponseEntity<List<Employe>> getAllEmployes(){
		List<Employe> employes=employeRepository.findAll();
		
		return new ResponseEntity<List<Employe>>(employes,HttpStatus.OK);
	}
}

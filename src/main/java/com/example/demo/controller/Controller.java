package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.Repository;

import com.example.demo.model.Datamodel;


@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class Controller {
	
	@Autowired
	Repository repo;
	
	
    @GetMapping("/customer")
	public List<Datamodel> getdata(){
		
		List<Datamodel> data = (List<Datamodel>)repo.findAll();
		
		
		
		
		return data;
	}
	
	@PostMapping("/customer")
	public Datamodel save(@RequestBody Datamodel DatamodelObj) {
		return repo.save(DatamodelObj);
	}
	
	@GetMapping("/customer/{id}")
	  public ResponseEntity<Datamodel> getTutorialById(@PathVariable("id") long id) {
	    Optional<Datamodel> cdata = repo.findById(id);

	    if (cdata.isPresent()) {
	      return new ResponseEntity<>(cdata.get(), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }


}

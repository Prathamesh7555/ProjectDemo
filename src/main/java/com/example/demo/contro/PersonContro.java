package com.example.demo.contro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Person;
import com.example.demo.SerImpl.PersonSerImpl;

@RestController
public class PersonContro {
	
	
	@Autowired
	public PersonSerImpl personserimpl;
	
	@PostMapping("/saveperson")
	public ResponseEntity<Person>addperson(@RequestBody Person person){
		
		Person aa=personserimpl.saveperson(person);
		return new ResponseEntity<>(aa,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/getallpeson")
	public ResponseEntity<List<Person>>allperson(){
		List<Person> bb= personserimpl.getperson();
		return new ResponseEntity<>(bb,HttpStatus.ACCEPTED);
	}
	

}

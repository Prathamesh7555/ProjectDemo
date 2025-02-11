package com.example.demo.SerImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Person;
import com.example.demo.Repo.PersonRepo;
@Service
public class PersonSerImpl {
	
	@Autowired
	public PersonRepo personrepo;
	
	public Person saveperson(Person person) {
		return personrepo.save(person);
	}
	
	public List<Person>getperson(){
		return personrepo.findAll();
	}

}

package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person, Long>{

}

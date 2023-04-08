package com.dio.RDS.controller;

import com.dio.RDS.Person;
import com.dio.RDS.repository.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {
    private final PersonRepository repositoryPerson;

    public PersonController(PersonRepository repositoryPerson) {
        this.repositoryPerson = repositoryPerson;
    }

    //Estão dispostos os metodos de requisição
    // find, save etc
    @GetMapping("/users")
    public List<Person> consultAllPersons(){
        return repositoryPerson.findAll();
    }
    @GetMapping("/user/{id}")
    public Optional<Person> consultByiD(@PathVariable Long id) {
        return repositoryPerson.findById(id);
    }
    @GetMapping("/")
    public String helloWorld(){
        return "This is mmy first API in Spring Boot";
    }
}

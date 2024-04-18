package com.attila.maven.test.demo.controller;

import com.attila.maven.test.demo.entity.Person;
import com.attila.maven.test.demo.service.PersonService;
import com.attila.maven.test.demo.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonServiceImpl personServiceImpl;

    @GetMapping("")
    public List<Person> getAllPerson() {
        return personServiceImpl.getAllPerson();
    }

}

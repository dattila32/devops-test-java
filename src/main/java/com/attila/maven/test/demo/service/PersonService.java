package com.attila.maven.test.demo.service;

import com.attila.maven.test.demo.repository.PersonRepository;
import com.attila.maven.test.demo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PersonService {

    public List<Person> getAllPerson();

}

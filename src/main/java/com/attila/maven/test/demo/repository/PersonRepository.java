package com.attila.maven.test.demo.repository;

import com.attila.maven.test.demo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
    @Query(nativeQuery = true, value="select * from Person")
    List<Person> getAllPerson();
}

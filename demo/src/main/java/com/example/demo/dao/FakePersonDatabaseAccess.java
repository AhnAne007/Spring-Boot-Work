package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDao")
public class FakePersonDatabaseAccess implements PersonDao{
    private static List<Person> DB = new ArrayList<>();

    @Override
    public List<Person> selectAllPersons() {
        return DB;
    }

    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getUserName(), person.getPassWord()));
        return 1;
    }
}

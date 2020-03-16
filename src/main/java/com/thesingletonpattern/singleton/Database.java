package com.thesingletonpattern.singleton;

import java.util.Arrays;
import java.util.List;

public class Database {
    public void connect() {
        System.out.println("Establishing a connection to the database.");
    }
    
    public List<Person> queryForPeopleWithName(String name) {
        // constructor generates a random id for now.
        return Arrays.asList(new Person(name), new Person(name));
    }
}

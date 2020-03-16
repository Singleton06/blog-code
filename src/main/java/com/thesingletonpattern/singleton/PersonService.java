package com.thesingletonpattern.singleton;

import java.util.List;

public enum PersonService {
    INSTANCE;
    
    private final Database database;
    
    PersonService() { 
        this.database = new Database();
        database.connect();
    }
    
    public List<Person> getPeopleWithName(String name) { 
        return database.queryForPeopleWithName(name);
    }
}

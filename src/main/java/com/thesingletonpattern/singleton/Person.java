package com.thesingletonpattern.singleton;

import java.util.Random;

public class Person {
    private final String name;
    private final int id;
    public Person(String name) { 
        this.name = name;
        this.id = new Random().nextInt(10000);
    }
    
    public String getName() { 
        return name;
    }
    
    public int getId() {
        return id;
    }
}
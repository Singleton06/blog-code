package com.thesingletonpattern.singleton;

import java.util.List;

public class Consumer {
    public static void main(String[] args) { 
        List<Person> person = PersonService.INSTANCE.getPeopleWithName("Dustin");
        person.stream().forEach(p -> System.out.println(p.getName() + " with id " + p.getId()));
    }
}

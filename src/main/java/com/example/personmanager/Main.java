package com.example.personmanager;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        PersonManager personManager = PersonManager.getInstance();
        personManager.addPerson(new Person(1, "lbdfa", "1990-01-01"));
        personManager.addPerson(new Person(2, "rbfdby", "1991-02-02"));
        personManager.addPerson(new Person(3, "ofawm", "1992-03-03"));
        personManager.addPerson(new Person(4, "Sadawra", "1993-04-04"));
        personManager.addPerson(new Person(5, "acnbkejc", "1994-05-05"));

        // Using an Iterator to remove persons with name "Tom"
        Iterator<Person> iterator = personManager.getPersonList().iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getName().equals("Tom")) {
                iterator.remove();
            }
        }

        // Printing the updated list of persons
        for (Person person : personManager.getPersonList()) {
            System.out.println(person);
        }
    }
}
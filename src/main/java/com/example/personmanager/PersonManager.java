package com.example.personmanager;
import java.util.LinkedList;
import java.util.List;

public class PersonManager {
    private static PersonManager instance;
    private LinkedList<Person> personList;

    private PersonManager() {
        personList = new LinkedList<>();
    }

    public static PersonManager getInstance() {
        if (instance == null) {
            instance = new PersonManager();
        }
        return instance;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(LinkedList<Person> personList) {
        this.personList = personList;
    }

    public void addPerson(Person person) {
        personList.addLast(person);
    }

    public void addPersons(Person... persons) {
        for (Person person : persons) {
            addPerson(person);
        }
    }

    public void addPersons(List<Person> personList) {
        this.personList.addAll(personList);
    }

    public Person getNextPerson() {
        return personList.removeFirst();
    }

    public Person whoIsNext() {
        return personList.getFirst();
    }
}
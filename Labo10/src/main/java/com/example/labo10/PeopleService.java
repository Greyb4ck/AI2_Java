package com.example.labo10;

import com.example.labo10.Person;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class PeopleService {
    private List<Person> people;

    @PostConstruct
    public void init(){
        people = new ArrayList<>();
        people.add(new Person("Jaś","Kowalski"));
        people.add(new Person("Karol","Kowalski"));
        people.add(new Person("Grzegorz","Domakna"));
    }

    public Person getPerson(int index) {return people.get(index);}

    public void addPerson(Person p) {people.add(p);}

    public void setPerson(int index, Person p) {people.set(index, p); }

    public void removePerson(int index) {people.remove(index);}

    public List<Person> getPeople() {return people;}

    public void setPeople(List<Person> people) {
        this.people = people;
    }
}

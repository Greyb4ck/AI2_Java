package com.example.labo10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RestControler {
    final PeopleService peopleService;

    @Autowired
    public RestControler(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @GetMapping("/people")
    public List<Person> getPeople() {
        return peopleService.getPeople();
    }

    @GetMapping("/people/{index}")
    public ResponseEntity<Person> getPerson(@PathVariable int index) {
        try {
            return ResponseEntity.ok(peopleService.getPerson(index));
        }catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping("/people")
        public ResponseEntity<?> addPerson(@RequestBody Person person) {
            peopleService.addPerson(person);
            return ResponseEntity.ok().build();

    }

    @PutMapping("/people/{index}")
    public ResponseEntity<?> updatePerson(@PathVariable int index,@RequestBody Person person){
        try{
            peopleService.setPerson(index, person);
            return ResponseEntity.ok().build();
        }catch(Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/people/{index}")
    public ResponseEntity<?> removePerson(@PathVariable int index) {
        try {
            peopleService.removePerson(index);
            return ResponseEntity.ok().build();
        } catch(Exception e) {
            return ResponseEntity.notFound().build();
        }

    }

}

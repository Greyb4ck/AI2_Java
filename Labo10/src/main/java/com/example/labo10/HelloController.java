package com.example.labo10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HelloController {
    final PeopleService peopleService;

    @Autowired
    public HelloController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @GetMapping("/people")
    public String people(Model model) {
        model.addAttribute("people", peopleService.getPeople());
        return "people";
    }

    @GetMapping("/people/{index}")
    public String person(Model model,@PathVariable int index) {
        model.addAttribute("person", peopleService.getPerson(index));
        return "person";
    }

    @GetMapping("/add")
    public String add(Model model) {
        Person person = new Person();
        model.addAttribute("person", person);
        return "edit";
    }

    @PostMapping("/save")
    public String save(Person person) {
        peopleService.addPerson(person);
        return "redirect:/people";
    }
}

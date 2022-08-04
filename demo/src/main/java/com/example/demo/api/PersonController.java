package com.example.demo.api;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("api/v1/person")
@RestController
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    // Now I need to make some endpoints and requests
    @PostMapping // To use POST request
    public void addPerson(@RequestBody Person person){
        personService.addPerson(person);
    }

    @GetMapping//("/getall") // To use GET request
    public List<Person> getAllPersons(){
        return personService.getAllPerons();
    }
//
//    @GetMapping("/byid") // To use GET request
//    public Person personsById(@RequestParam String tea, @RequestParam String sugarType){
//        List<Person> persons = personService.getAllPerons();
//        for (Person person: persons){
//
//        }
//        return personService.getAllPerons();
//    }
}

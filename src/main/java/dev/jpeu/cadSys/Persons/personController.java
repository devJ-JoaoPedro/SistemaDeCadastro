package dev.jpeu.cadSys.Persons;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class personController {

    @GetMapping("/bemvindos")
    public String boasVindas() {
        return "Boas Vindas";
    }

    // Add people (CREATE)
    @PostMapping("/addPerson")
    public String addPerson() {
        return "Person Added Successfully";
    }

    // Search people for id (CREATE)
    @GetMapping("/searchPerson")
    public String searchPeople() {
        return "Person Found Successfully";
    }

    // Show all people (READ)
    @GetMapping("/allPeople")
    public String allPeople() {
        return "List With All the People";
    }

    // Show people for id (READ)
    @GetMapping("/showPersonById")
    public String showPersonById() {
        return "Person Found Successfully";
    }

    // Modify people (UPDATE)
    @PutMapping("/modifyById")
    public String modifyPersonById() {
        return "Person Modified Successfully";
    }

    // Delete People (DELETE)
    @DeleteMapping("/deleteById")
    public String deletePersonById() {
        return "Person Deleted Successfully";
    }

}

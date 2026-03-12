package dev.jpeu.cadSys.Persons;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class personController {

    @GetMapping("/bemvindos")
    public String boasVindas() {
        return "Boas Vindas";
    }



}

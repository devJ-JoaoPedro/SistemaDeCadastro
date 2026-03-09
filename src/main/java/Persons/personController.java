package Persons;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class personController {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Boas Vindas";
    }



}

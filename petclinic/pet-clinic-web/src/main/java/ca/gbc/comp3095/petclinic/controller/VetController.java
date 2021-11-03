package ca.gbc.comp3095.petclinic.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vet")
@Controller
public class VetController {
    @RequestMapping({"/", "/index", "/index.html"})
    public String listVet(){
        return "vet/index";
    }
}

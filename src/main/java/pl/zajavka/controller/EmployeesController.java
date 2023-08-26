package pl.zajavka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

@Controller
@RequestMapping("/employees")
public class EmployeesController {
    
    @GetMapping
    public String employees(final Model model) { 
        model.addAttribute("randomValue", randomInt(1, 10));
        return "employees"; // wyswietl plik employees.jsp
    }

    private int randomInt(final int min, final int max) {
        return new Random().nextInt(max - min) + min;
    }

}
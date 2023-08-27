package pl.zajavka.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

@Slf4j
@Controller
@RequestMapping("/employees")
public class EmployeesController {

    @GetMapping
    public String employees(final Model model) {
        int randomValue = randomInt(1, 10);
        log.info("Random: [{}]", randomValue);
        model.addAttribute("randomValue", randomValue);
        return "employees"; // wyswietl plik employees.jsp
    }

    private int randomInt(final int min, final int max) {
        return new Random().nextInt(max - min) + min;
    }


}
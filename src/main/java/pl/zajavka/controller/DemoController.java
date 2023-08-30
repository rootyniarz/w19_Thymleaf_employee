package pl.zajavka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class DemoController {
    @GetMapping("/hello")
    public String sayHello() {
        return "hellopage"; // wyswietl plik hellopage.jsp
    }
}
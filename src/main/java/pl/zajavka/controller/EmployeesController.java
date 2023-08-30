package pl.zajavka.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
@Controller
@RequestMapping("/employees")
public class EmployeesController {

    private int count;
    AtomicInteger atomicCount = new AtomicInteger(0);

    @GetMapping
    public String employees(final Model model) {
        int countPlus = ++count;
        int atomicCountPlus = atomicCount.incrementAndGet();
        log.info("count: [{}]", countPlus);
        log.info("atomicCount: [{}]", atomicCountPlus);
        model.addAttribute("count", countPlus);
        model.addAttribute("atomicCount", atomicCountPlus);
        return "employees"; // wyswietl plik employees.jsp
    }

    private int randomInt(final int min, final int max) {
        return new Random().nextInt(max - min) + min;
    }


}
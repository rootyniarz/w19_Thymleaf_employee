package pl.zajavka.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.zajavka.infrastructure.database.entity.EmployeeEntity;
import pl.zajavka.infrastructure.database.repository.EmployeeRepository;

import java.math.BigDecimal;

@Controller
@RequestMapping("/employees")
@AllArgsConstructor
public class EmployeesController {
    private EmployeeRepository employeeRepository;
    @PostMapping("/add")
    public String addEmployee(
            @RequestParam(value = "name") String name,
            @RequestParam(value = "surname") String surname,
            @RequestParam(value = "salary") String salary
    ) {
        EmployeeEntity newEmployee = EmployeeEntity.builder()
  .name(name)
                .surname(surname)
                .salary(new BigDecimal(salary))
                .build();
        employeeRepository.save(newEmployee);
        return "redirect:/employees";
    }
}


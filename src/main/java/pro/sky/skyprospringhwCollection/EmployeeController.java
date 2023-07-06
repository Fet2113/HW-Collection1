package pro.sky.skyprospringhwCollection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {
    public final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/employee")
    public String getEmployeeInfo(@RequestParam("number") Integer number) {
        final String employee;
        try {
            employee = employeeService.getEmployee(number);
        } catch (
                BadEmployeeNumberExeption e) {
            throw new RuntimeException(e);
        }
        return employee;
    }
}

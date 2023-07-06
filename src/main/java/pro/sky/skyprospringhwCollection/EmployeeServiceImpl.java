package pro.sky.skyprospringhwCollection;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> employees = List.of(
            new Employee(
                    "Цадкин",
                    "Мирослав"),
            new Employee("Ласынов", "Тимур"),
            new Employee("Симаков", "Дмитрий"),
            new Employee("Коростылев", "Сергей"),
            new Employee("Иванов", "Евгений"),
            new Employee("Штефан", "Виктор"),
            new Employee("Параничев", "Александр"),
            new Employee("Полякова", "Римма"),
            new Employee("Ильин", "Евгений"),
            new Employee("Попко", "Антон")
    );
@Override
    public String getEmployee(Integer number) throws BadEmployeeNumberExeption {
        final Employee employee;
        if (number >= employees.size()) {
            throw new BadEmployeeNumberExeption("ошибка");
        }
        employee = employees.get(number);
        final String employeeDescription = ""
                + employee.getFirstName() + ""
                + employee.getLastName() + "";
        return employeeDescription;

    }
}


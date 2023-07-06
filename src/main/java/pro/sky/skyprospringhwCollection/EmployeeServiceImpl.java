package pro.sky.skyprospringhwCollection;

import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl {

    Employee[] employee = new Employee[10];

    {
        employee[0] = new Employee("Цадкин", "Мирослав");
        employee[1] = new Employee("Ласынов", "Тимур");
        employee[2] = new Employee("Симаков", "Дмитрий");
        employee[3] = new Employee("Коростылев", "Сергей");
        employee[4] = new Employee("Иванов", "Евгений");
        employee[5] = new Employee("Штефан", "Виктор");
        employee[6] = new Employee("Параничев", "Александр");
        employee[7] = new Employee("Полякова", "Римма");
        employee[8] = new Employee("Ильин", "Евгений");
        employee[9] = new Employee("Попко", "Антон");
    }
}

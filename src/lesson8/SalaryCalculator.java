package lesson8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SalaryCalculator {

    public static double getTotalSalary(List<Employee> employeeList){
        double totalSalary = 0;

        for (Employee employee : employeeList) {
            totalSalary = totalSalary + employee.getSalary() + employee.getSupportSalary();
        }
        return totalSalary;
    }

    public static void main(String[] args) {
        Employee ceo, standardEmployee, manager;
        ceo = new CEO(100,0);
        manager = new Manager(50, 3);
        standardEmployee = new StandardEmployee(30, 5);
        standardEmployee.setSupportSalary(3);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(manager);
        employeeList.add(ceo);
        employeeList.add(standardEmployee);

        System.out.println(employeeList);

        Collections.sort(employeeList);

        System.out.println(employeeList);
    }
}

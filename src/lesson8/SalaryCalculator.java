package lesson8;

import java.util.ArrayList;
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
        Employee ceo, standard, manager;
        ceo = new CEO(100,0);
        manager = new Manager(50, 3);
        standard = new StandardEmployee(30, 5);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(ceo);
        employeeList.add(manager);
        employeeList.add(standard);
    }
}

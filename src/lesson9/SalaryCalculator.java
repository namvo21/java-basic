package lesson9;

import java.util.Collections;
import java.util.List;

public class SalaryCalculator {

    public static double getTotalSalary(List<IEmployee> employeeList){

        double totalSalary = 0;
        for (IEmployee employee : employeeList) {
            totalSalary = totalSalary + employee.salary() + employee.supportSalary();
        }
        return totalSalary;
    }
}

package lesson9;

import lesson8.Employee;

public class StandardEmployee implements IEmployee{

    @Override
    public double salary() {
        return 30;
    }

    @Override
    public double supportSalary() {
        return 5;
    }
}

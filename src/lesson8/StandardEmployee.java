package lesson8;

public class StandardEmployee extends Employee{

    public StandardEmployee(double salary, double supportSalary) {
        super(salary, supportSalary);
    }

    @Override
    public void setSupportSalary(double supportSalary) {
        this.supportSalary = supportSalary;
    }
}

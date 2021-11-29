package lesson8;

public class Manager extends Employee{

    public Manager(double salary, double supportSalary) {
        super(salary, supportSalary);
    }

    @Override
    public void setSupportSalary(double supportSalary) {
        this.supportSalary = supportSalary;
    }
}

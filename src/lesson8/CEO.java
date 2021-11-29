package lesson8;

public class CEO extends Employee{

    public CEO(double salary, double supportSalary) {
        super(salary, supportSalary);
    }

    @Override
    public void setSupportSalary(double supportSalary) {
        this.supportSalary = 0;
    }
}

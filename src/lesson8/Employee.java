package lesson8;

public abstract class Employee {

    protected double salary;
    protected double supportSalary;

    public Employee(double salary, double supportSalary) {
        this.salary = salary;
        this.supportSalary = supportSalary;
    }

    public abstract void setSupportSalary(double supportSalary);

    public double getSalary() {
        return salary;
    }

    public double getSupportSalary() {
        return supportSalary;
    }
}

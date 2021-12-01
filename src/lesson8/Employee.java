package lesson8;

public abstract class Employee implements Comparable<Employee>{

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

    @Override
    public int compareTo(Employee employee) {
        // ASC sort
        double diffSalary = this.salary - employee.getSalary();
        // DESC sort
        //double diffSalary = employee.getSalary() - this.salary;
        return Double.valueOf(diffSalary).intValue();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", supportSalary=" + supportSalary +
                '}';
    }
}

package module3.practice.task4_1;

public abstract class Worker {

    private double salary;

    abstract double averageMonthlySalary();

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

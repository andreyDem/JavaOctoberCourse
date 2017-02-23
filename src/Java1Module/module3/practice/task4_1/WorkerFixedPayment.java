package Java1Module.module3.practice.task4_1;

public class WorkerFixedPayment extends Worker{

    private double monthSalary;

    public WorkerFixedPayment(double monthSalary) {
        this.monthSalary = monthSalary;
    }

    @Override
    double averageMonthlySalary() {
        return getMonthSalary();
    }

    public double getMonthSalary() {
        return monthSalary;
    }
}

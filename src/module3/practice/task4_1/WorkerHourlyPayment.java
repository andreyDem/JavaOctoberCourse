package module3.practice.task4_1;

public class WorkerHourlyPayment extends Worker{
    private double hourlyPayment;

    public WorkerHourlyPayment(double hourlyPayment) {
        this.hourlyPayment = hourlyPayment;
    }

    double averageMonthlySalary() {
        return 20.8 * 8 * getHourlyPayment();
    }

    public double getHourlyPayment() {
        return hourlyPayment;
    }

}

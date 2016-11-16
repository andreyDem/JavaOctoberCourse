package module3.practice.task4_1;

public class WorkerFixedPayment extends Worker{

    @Override
    double averageMonthlySalary() {
        return getSalary();
    }
}

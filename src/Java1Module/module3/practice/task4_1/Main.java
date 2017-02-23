package Java1Module.module3.practice.task4_1;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new WorkerFixedPayment(2000);
        Worker worker2 = new WorkerHourlyPayment(10);

        System.out.println(worker1.averageMonthlySalary());
        System.out.println(worker2.averageMonthlySalary());

    }
}

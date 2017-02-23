package Java1Module.module3.practice.task3;

public class Worker extends Person{
    private String address;
    private int salary;

    public Worker(String gender, String name, int age, String surname, String adress, int salary) {
        super(gender, name, age, surname);
        this.address = adress;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}

package module3.practice.task3;

public class Worker extends Person{
    private String adress;
    private int salary;

    public Worker(String gender, String name, int age, String surname, String adress, int salary) {
        super(gender, name, age, surname);
        this.adress = adress;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}

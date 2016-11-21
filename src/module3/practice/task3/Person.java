package module3.practice.task3;

public class Person {
    private String gender;
    private String name;
    private int age;
    private String surname;

    public Person(String gender, String name, int age, String surname) {
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", surname='" + surname + '\'' +
                '}';
    }
}

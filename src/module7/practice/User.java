package module7.practice;

import java.util.*;

public class User{
    private String name;
    private String lastName;
    private Integer age;

    public User(String name, String lastName, Integer age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            users.add(new User(random.nextInt(1000) + "", random.nextInt(1000) + "", random.nextInt(1000)));
        }
        UserComparator userComparator = new UserComparator();
        Collections.sort(users, userComparator);
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}



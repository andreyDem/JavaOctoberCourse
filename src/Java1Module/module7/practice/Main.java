package Java1Module.module7.practice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            users.add(new User(random.nextInt(100) + "", random.nextInt(100) + "", random.nextInt(100)));
        }
        Collections.sort(users, new UserComparator());
        for (User user : users) {
            System.out.println(user);
        }
        System.out.println();
        for (User user : users) {
            if (user.getAge()>21){
                System.out.println(user);
            }
        }
    }
}

package module7.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            users.add(new User(random.nextInt(100) + "", random.nextInt(100) + "", random.nextInt(100)));
        }
        UserComparator userComparator = new UserComparator();
        Collections.sort(users, userComparator);
        for (User user : users) {
            System.out.println(user);
        }
    }
}

package Java1Module.module6.homeWork;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User andrey = new User(1, "Andrey", "Demchuk", 5000, 20000);
        User andrey2 = new User(1, "Andrey", "Demchuk", 5000, 20000);
        User aleksey = new User(2, "Aleksey", "Girya", 1000, 5000);
        User matvey = new User(3, "Matvey", "Pe4kin", 3000, 15000);
        User olga = new User(4, "Olga", "Danilovna", 500, 5000);
        User empty = null;

        User[] users = {andrey, andrey2, aleksey, matvey, olga, empty};

        System.out.println(Arrays.toString(UserUtils.uniqueUsers(users)));
        System.out.println(Arrays.toString(UserUtils.usersWithConditionalBalance(users, 5000)));
        System.out.println(Arrays.toString(UserUtils.paySalaryToUsers(users)));
        System.out.println(Arrays.toString(UserUtils.getUsersId(users)));
        System.out.println(Arrays.toString(UserUtils.deleteEmptyUsers(users)));
    }
}

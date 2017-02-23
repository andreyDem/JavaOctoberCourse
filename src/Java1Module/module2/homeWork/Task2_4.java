package Java1Module.module2.homeWork;

import java.util.Arrays;
import java.util.Scanner;

public class Task2_4 {
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of " + Arrays.toString(ownerNames));
        String name = sc.nextLine();
        System.out.println("Enter your withdrawal");
        double withdrawal = sc.nextDouble();

        fundBalance(name, withdrawal, balances, ownerNames);
    }

    static void fundBalance(String name, double withdrawal, int[] balance, String[] ownerNames) {
        int count = -1;
        for (int i = 0; i < ownerNames.length; i++) {
            if (name.equals(ownerNames[i])) {
                count = i;
                break;
            }
        }
        if (count < 0) {
            System.out.println("Name Incorrect");
            System.exit(0);
        }

        double total = balance[count] + withdrawal;
        System.out.println(name + " " + total);
    }
}

package Java1Module.module2.homeWork;

import java.util.Arrays;
import java.util.Scanner;

public class Task2_3 {

    public static void main(String[] args) {
        int[] balances = new int[]{1200, 250, 2000, 500, 3200};
        String[] ownerNames = new String[]{"Jane", "Ann", "Jack", "Oww", "Lane"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name " + Arrays.toString(ownerNames) + "\n");
        String name = sc.nextLine();
        System.out.println("Enter withdrawal");
        double withdrawal = sc.nextDouble();
        withdrawMoney(ownerNames, balances, name, withdrawal);
    }

    static void withdrawMoney(String[] owner, int[] balanceOwner, String name, double withdrawal) {
        double commision = 5.0D * withdrawal / 100.0D;
        int counter = -1;

        for (int total = 0; total < owner.length; ++total) {
            if (name.equals(owner[total])) {
                counter = total;
                break;
            }
        }
        if (counter < 0) {
            System.out.println("Name Incorrect");
            System.exit(0);
        }

        double var10 = (double) balanceOwner[counter] - withdrawal - commision;
        if (var10 >= 0.0D) {
            System.out.println(name + " " + withdrawal + " " + var10);
        } else {
            System.out.println(name + " NO");
        }

    }
}
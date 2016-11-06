package module2;


import java.util.Arrays;
import java.util.Scanner;

public class TestWork {
    public static void main(String[] args) {


        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        balance(balances, ownerNames);
    }

    public static void balance(int[] balances, String[] ownerNames) {
        double commision = 0.05;
        double calculation;
        Scanner in = new Scanner(System.in);
        System.out.println("Please, enter name:");
        String name = in.next();
        System.out.println("Please, enter withdrawal amount:");
        String withdrawal = in.next();
        int result = Integer.parseInt(withdrawal);
        for (int i = 0; i < ownerNames.length; i++) {
            if (name.equals(ownerNames[i])) {
                for (int j = i; j < balances.length; j++) {
                    int b = balances[j];
                    calculation = b - result - (result * commision);
                    if (calculation <= balances[j]) {
                        System.out.println("Owner name: " + ownerNames[i] + ";\n Withdrawal: " + withdrawal + "; " +
                                "\n Balance: " + calculation + ";");
                        break;
                    } else {
                        System.out.println("Operation denied!");
                    }
                }
            }
        }
    }
}




package module1.practice;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] balances = {100, 5400, 4321, 980, -50, 0};
        String[] name = {"Test1", "Andrey", "Alex", "User", " Olga", "Pasha"};
        int count = 0;
        for (int i : balances) {
            if (balances[i] > 1000) {
                count++;
            }
        }
        String[] owner = new String[count];
        int index = 0;
        int indexOwner = 0;
        for (int i : balances) {
            if (balances[i] > 1000) {
                owner[indexOwner] = name[index];
                indexOwner++;
            }
            index++;
        }
        System.out.println(Arrays.toString(owner));
    }
}

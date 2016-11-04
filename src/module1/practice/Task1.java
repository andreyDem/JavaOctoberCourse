package module1.practice;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] balances = {100, 5400, 4321, 980, -50, 100};
        String[] names = {"Test1", "Andrey", "Alex", "User", " Olga", "Pasha"};
        int count = 0;
        for (int bal : balances) {
            if (bal > 1000) {
                count = count + 1;
                //count
            }
        }

        String[] owners = new String[count];

        int index = 0;
        int indexOwners = 0;
        for (int bal : balances) {
            if (bal > 1000) {
                owners[indexOwners] = names[index];
                indexOwners++;
            }
            index++;
        }
        System.out.println(Arrays.toString(owners));
    }
}

package Java1Module.module2.practice;

import java.util.Scanner;

public class Recuria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        long factorial = recurs(number);
        System.out.println(factorial);
    }

    private static long recurs(int number) {
        if (number == 0 || number == 1)
            return 1;
        else
            return recurs(number - 1) * number;
    }


}



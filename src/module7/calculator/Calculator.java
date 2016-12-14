package module7.calculator;

import java.util.Scanner;

public class Calculator {
    private int a;
    private int b;
    private char aChar;

    private Scanner scanner = new Scanner(System.in);

    public Calculator() {
        System.out.println("Enter your calculation, example: 3 + 3");

        a = scanner.nextInt();
        char[] chars = {'+', '-', '/', '*', '^'};
        do {
           aChar = scanner.next();
        }
        b = scanner.nextInt();
        System.out.println("Your calculation is " + a + " " + aChar + " " + b);
    }

    public int calculation(int a, char aChar, int b) {

        if (aChar == '+') {
            return sum(a, b);
        } else if (aChar == '-') {
            return difference(a, b);
        } else if (aChar == '*') {
            return multiplication(a, b);
        } else if (aChar == '/') {
            return division(a, b);
        } else if (aChar == '^') {
            return power(a, b);
        } else
            return 0;

    }

    private int power(int a, int b) {
        int result = a;
        do {
            result = result * a;
            b--;
        } while (b != 1);
        System.out.println(a + " to power " + b + "= " + result);
        return result;
    }

    private int division(int a, int b) {
        if (a % b == 0) {
            System.out.println("division= " + (a / b));
            return a / b;
        } else {
            System.out.println("division= " + (a / b + a % b));
            return (a / b + a % b);
        }
    }

    private int multiplication(int a, int b) {
        System.out.println("multiplication= " + (a * b));
        return a * b;
    }

    private int sum(int a, int b) {
        System.out.println("sum= " + (a + b));
        return a + b;
    }

    private int difference(int a, int b) {
        System.out.println("difference= " + (a - b);
        return a - b;
    }

}

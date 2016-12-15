package module7.calculator;

import java.util.Scanner;

public class Calculator {
    private int a;
    private int b;
    private char aChar;

    private Scanner scanner = new Scanner(System.in);

    public Calculator() {
        System.out.println("Enter your calculation, example: 3 + 3");

        char[] chars = {'-', '+', '*', '/', '^'};
        String str = scanner.nextLine();
        String[] strings;
        if (str.contains(" ")) {
            strings = str.split(" ");
            a = Integer.parseInt(strings[0]);
            b = Integer.parseInt(strings[2]);
            aChar = strings[1].charAt(0);
        } else {
            for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < chars.length; j++) {
                    if (str.charAt(i) == chars[j]) {
                        a = Integer.parseInt(str.substring(0, i));
                        aChar = str.charAt(i);
                        b = Integer.parseInt(str.substring(i + 1));
                    }
                }
            }
        }

        System.out.println("Your calculation is " + a + " " + aChar + " " + b);
    }


    public int calculation() {

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
        } else {
            System.out.println("Something wrong");
            return 0;
        }
    }

    private int power(int a, int b) {
        int result = a;
        int counter = b;
        do {
            result = result * a;
            counter--;
        } while (counter != 1);
        System.out.println(a + " powered by " + b + "= " + result);
        return result;
    }

    private int division(int a, int b) {
        if (b == 0) {
            System.out.println("can't division by zero");
            return 0;
        }
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
        System.out.println("difference= " + (a - b));
        return a - b;
    }

}

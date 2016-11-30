package independentWork.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //    Написать программу, которая:
//            1. вводит с консоли число N > 0
//            2. потом вводит N чисел с консоли
//3. выводит на экран максимальное из введенных N чисел.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        while (N <= 0)
            N = Integer.parseInt(sc.nextLine());
        int arr[] = new int[N];
        int i = 0;
        do {
            arr[i] = Integer.parseInt(sc.nextLine());
            i++;
        } while (i < N);
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
    }
}

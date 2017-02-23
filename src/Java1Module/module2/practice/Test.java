package Java1Module.module2.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number n");
        int n = scan.nextInt();
        int [] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)((Math.random()-0.5)*100);
        }
//        arr[0] = 1;
//
//        arr[1] = 1;
        System.out.println(Arrays.toString(arr));
        int k = countOfNumberN(arr, n);

        if(k==1)
            System.out.println("yes");
        else if (k==0)
            System.out.println("no");
        else
            System.out.println("k = " + k);

    }

    static int countOfNumberN(int[] arr, int n){
        int k = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==n)
                k++;
        }
        return k;
    }
}

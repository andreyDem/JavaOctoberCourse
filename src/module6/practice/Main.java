package module6.practice;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = createRandmInt(2, 10);
        }
        System.out.println(Arrays.toString(arr));
    }


    static int createRandmInt(int a, int b) {
        Random rand = new Random();
        int number = 0;
        return number = rand.nextInt(Math.abs(b-a) +1);
    }
}
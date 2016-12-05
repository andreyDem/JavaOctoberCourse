package module6.practice;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int arr[] = new int[20];
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
//            arr[i] = createRandmInt(1, 5);
            arr[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(arr));
//        System.out.println(random.nextInt(20));
    }


    static int createRandmInt(int a, int b) {
        Random rand = new Random();
        int number = 0;
        while (number < a && number > b){

            number = rand.nextInt();
        }
        return number;
    }
}
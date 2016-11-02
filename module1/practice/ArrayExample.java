package module1.practice;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int[] array1 = new int[5];
        array1[4] = 10;
        System.out.println(Arrays.toString(array1));
//
        int index = array.length - 1;
        while (index > 0) {
            System.out.println(array[index]);
            index--;
        }
        for (int i = 0; i <array1.length ; i++) {
            System.out.println(array1[i]);
        }

        for (int i : array1) {
            System.out.println(i);
        }


    }
}

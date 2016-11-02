package module2;

import java.util.Arrays;

public class TestWork {
    public static void main(String[] args) {

        int[] arr1 = new int[10];
        double[] arr2 = new double[10];

        for (int i = 0; i < 10; i++) {
            arr1[i] = (int) ((Math.random() - 0.5) * 100);
        }
        System.out.println(Arrays.toString(arr1));

        modulus(arr1);

        for (int i = 0; i < 10; i++) {
            arr2[i] = (Math.random() - 0.5) * 100;
        }
        System.out.println(Arrays.toString(arr2));
        modulus(arr2);
    }


    static void modulus(int[] arr) {
        if (arr[0] < 0)
            System.out.println(0);

            System.out.println(arr[0] % arr[arr.length - 1]);
    }

    static void modulus(double[] arr) {
        if (arr[0] < 0)
            System.out.println(0);

            System.out.println(arr[0] % arr[arr.length - 1]);
    }
}

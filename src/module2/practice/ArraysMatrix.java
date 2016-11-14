package module2.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
//        int[] arr = createRandomArray(n);
        int[][] matrixArray = new int[n][n];

//        System.out.println(Arrays.toString(arr));

        for (int i = 0; i <matrixArray.length ; i++) {
            System.out.println(Arrays.toString(createRandomArray(n)));
        }


    }

    private static int[] createRandomArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random()-0.5)*100);
        }
        return arr;
    }

//    private static int[][] createNewArray(int n){
//        int [][] arr = new int[n][n];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j <arr[i].length ; j++) {
//            }
//        }
//        return arr;
//    }

    private static void reverseArray(int[] array){
        for (int i = array.length-1; i >0 ; i--) {
            System.out.println(Arrays.toString(createRandomArray(5)));
        }

    }
}

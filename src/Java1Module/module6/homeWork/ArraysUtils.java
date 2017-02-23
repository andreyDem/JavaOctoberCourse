package Java1Module.module6.homeWork;


public final class ArraysUtils {
    private ArraysUtils() {
    }

    public static int[] reverse(int[] array) {
        int[] revArr = new int[array.length];
        int count = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            revArr[count] = array[i];
            count++;
        }
        return revArr;
    }

    public static int[] findEvenElements(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                count++;
        }
        int[] evenArr = new int[count];
        count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenArr[count] = array[i];
                count++;
            }
        }
        return array;
    }

    public static void sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }

    public static void sum(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }

    public static void min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println(min);
    }

    public static void min(double[] arr) {
        double min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println(min);
    }

    public static void max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println(max);
    }

    public static void max(double[] arr) {
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println(max);
    }

    public static void maxPositive(int[] arr) {
        int positive = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positive = arr[i];
                break;
            }
        }
        if (positive < 0) {
            System.out.println("There is no positive elements in array");
            System.exit(0);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] > positive)
                positive = arr[i];
        }
        System.out.println(positive);
    }

    public static void maxPositive(double[] arr) {
        double positive = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positive = arr[i];
                break;
            }
        }
        if (positive < 0) {
            System.out.println("There is no positive elements in array");
            System.exit(0);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] > positive)
                positive = arr[i];
        }
        System.out.println(positive);
    }


    public static void multiplication(int[] arr) {
        long mult = arr[0];
        for (int i = 1; i < arr.length; i++) {
            mult = mult * arr[i];
        }
        System.out.println(mult);
    }

    public static void multiplication(double[] arr) {
        double mult = arr[0];
        for (int i = 1; i < arr.length; i++) {
            mult = mult * arr[i];
        }
        System.out.println(mult);
    }

    public static void modulus(int[] arr) {
        if (arr[0] < 0 || arr[0] < arr[arr.length - 1] || arr[arr.length - 1] < 0)
            System.out.println(0);
        else
            System.out.println(arr[0] % arr[arr.length - 1]);
    }

    public static void modulus(double[] arr) {
        if (arr[0] < 0 || arr[0] < arr[arr.length - 1] || arr[arr.length - 1] < 0)
            System.out.println(0);
        else
            System.out.println(arr[0] % arr[arr.length - 1]);
    }

    public static void secondLargest(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println(arr[arr.length - 2]);
    }

    public static void secondLargest(double[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (arr[j] > arr[j + 1]) {
                    double tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println(arr[arr.length - 2]);
    }
}

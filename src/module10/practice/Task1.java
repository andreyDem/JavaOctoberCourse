package module10.practice;

public class Task1 {
    public static void main(String[] args) {
        Integer a =20;
        Number b =10;
        Number c = 0;
        try {
            System.out.println(a/(Integer) b);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println(a/b.intValue());
        }

        try {
            System.out.println(a/c.intValue());
        } catch (ArithmeticException e) {
            System.out.println("catch " + e);
        }

        try {
            int[] arr = new int[2];
            System.out.println(arr[arr.length]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("catch " + e);
        }

        try {
            Integer result = Integer.valueOf("Some");
        } catch (NumberFormatException e) {
            System.out.println("catch " + e);
        } finally {
            System.out.println("Finally....");
        }

    }
}

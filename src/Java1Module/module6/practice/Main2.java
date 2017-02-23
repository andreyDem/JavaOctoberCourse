package Java1Module.module6.practice;

public class Main2 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        int count = 5;
        while (count>=0){
            triangle.show();
            triangle.hide();
            count--;
        }
        System.out.println();
        Square square = new Square();
        while (count<=5){
            square.show();
            square.hide();
            count++;
        }

    }
}

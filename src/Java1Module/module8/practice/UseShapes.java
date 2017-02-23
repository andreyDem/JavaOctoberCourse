package Java1Module.module8.practice;

import java.util.List;

public class UseShapes {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(new Point(6, 7), 14, 17);
        Rectangle rectangle1 = new Rectangle(new Point(8, 9), 10, 12);
        Rectangle rectangle2 = new Rectangle(new Point(16, 17), 20, 17);

        Group group = new Group();
        group.add(rectangle);
        group.add(rectangle1);
        group.add(rectangle2);

        Circle circle = new Circle(new Point(12, 12), 13);
        group.add(circle);

        List<Shape> all = group.getAll();

        for (Shape shape : all) {
            System.out.println(shape);
        }

        System.out.println("Area = " + group.getSumArea());
    }
}

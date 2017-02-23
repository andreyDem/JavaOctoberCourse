package Java1Module.module8.practice;

public class Circle extends Shape {
    private int radius;

    public Circle(Point point, int radius) {
        super(point);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                super.toString() +
                "radius=" + radius +
                '}';
    }
}

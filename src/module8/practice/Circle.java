package module8.practice;

public class Circle extends Shape {
    private int radius;

    public Circle(Point point, int radius) {
        super(point);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                super.toString() +
                "radius=" + radius +
                '}';
    }
}

package Java1Module.module8.practice;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(Point point, int width, int height) {
        super(point);

        this.width = width;
        this.height = height;
    }


    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                super.toString() +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}

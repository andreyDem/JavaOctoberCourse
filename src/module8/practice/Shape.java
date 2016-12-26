package module8.practice;

public abstract class Shape {
    private Point point;


    public Shape(Point point) {
      this.point = point;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "point=" + point +
                '}';
    }
}

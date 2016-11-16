package module3.practice.triangle;

public class Triangle {

    private final int x1;
    private final int y1;
    private final int x2;
    private final int y2;
    private final int x3;
    private final int y3;
    private double line1;
    private double line2;
    private double line3;
    private double square;
    private double perimeter;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {

        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;

        line1 = calculateLine(x1, y1, x2, y2);
        line2 = calculateLine(x2, y2, x3, y3);
        line3 = calculateLine(x1, y1, x3, y3);
    }

    public double square() {
        double halfPerimeter = perimeter() / 2;

        square = Math.sqrt(halfPerimeter * (halfPerimeter - line1) * (halfPerimeter - line2) * (halfPerimeter - line3));
        return square;
    }

    public double perimeter() {
        perimeter = line1 + line2 + line3;
        return perimeter;
    }

    private double calculateLine(int x1, int y1, int x3, int y3) {

        return Math.sqrt((Math.pow(x1 - x3, 2)) + Math.pow(y1 - y3, 2));
    }

    public void print() {
        if (line1 < line2 + line3 && line2 < line3 + line1 && line3 < line1 + line2) {
            System.out.println("Triangle normal");
            System.out.println("Perimeter " + perimeter());
            System.out.println("square " + square());
        } else if (line1 == line2 && line2 == line3 && line1 == line3) {
            System.out.println("Triangle equilateral");
            System.out.println("Perimeter " + perimeter());
            System.out.println("square " + square());
        } else System.out.println("Triangle break");
    }


}

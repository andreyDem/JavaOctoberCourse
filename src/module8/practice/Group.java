package module8.practice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Group {

    private List<Shape> shapes = new ArrayList<>();

    public void add(Shape shape) {
        shapes.add(shape);
    }

    public List<Shape> getAll() {
        return shapes;
    }

    public double getSumArea() {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.getArea();
        }

        return new BigDecimal(sum).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }


}

package Java1Module.module8.practice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

//    public Map<Class<? extends Shape>, Group> shapeSeparatedByType() {
//        Map<Class<? extends Shape>, Group> map = new HashMap<>();
////        Group group = map.get("Circle");
////
//        return null;
//    }

    public Map<String, Group> shapeSeparatedByType() {
        Map<String, Group> map = new HashMap<>();
        for (Shape shape : shapes) {

        }
        return null;
    }

    public <T extends Shape> Group shapeSeparatedByType(Class<T> tClass) {
        return null;
    }

}

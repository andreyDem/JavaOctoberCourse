package module8.practice;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private List<Shape> shapes = new ArrayList<>();

    public void add(Shape shape){
        shapes.add(shape);
    }

    public List<Shape> getAll() {
        return shapes;
    }
}

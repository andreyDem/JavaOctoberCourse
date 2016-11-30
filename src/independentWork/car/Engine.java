package independentWork.car;

/**
 * Created by Andrey on 28.11.2016.
 */
public class Engine {
    int x;
    int y;

    public Engine(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Engine() {
        this.x = 120;
        this.y = 130;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

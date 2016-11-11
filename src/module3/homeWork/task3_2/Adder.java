package module3.homeWork.task3_2;

public class Adder extends Arithmetic {
    @Override
    int add(Integer a, Integer b) {
        return super.add(a, b);
    }

    boolean check(Integer a, Integer b) {
        if (a >= b)
            return true;
        else return false;
    }
}

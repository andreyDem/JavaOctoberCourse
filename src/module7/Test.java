package module7;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        list.add(1, "10");

        System.out.println(list);
    }
}


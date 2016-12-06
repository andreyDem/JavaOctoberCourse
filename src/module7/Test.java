package module7;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        Set<String> set = new HashSet<String>();
        set.add("test");
        set.add("test1");
        set.add("test");
        System.out.println(set.size());
    }
}


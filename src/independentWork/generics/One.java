package independentWork.generics;

import java.util.ArrayList;
import java.util.List;

public class One {
    public static void main(String[] args) {
        List rawlist = new ArrayList();
        List<String> list = new ArrayList<>();
        rawlist = list;
        rawlist.add(8);
//        System.out.println(rawlist.get(0));
        String s = list.get(0);
    }
}

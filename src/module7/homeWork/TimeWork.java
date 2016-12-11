package module7.homeWork;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TimeWork {
    public static void main(String[] args) {
        List<Integer> arrayListInt = new ArrayList<>();
        List<String> arrayListStr = new ArrayList<>();

        List<Integer> linkedListInt = new LinkedList<>();
        List<String> linkedListStr = new LinkedList<>();

        long timeBefore = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            arrayListInt.add(i);
        }
        long timeAfter = System.currentTimeMillis();
        System.out.println(timeAfter - timeBefore);

        timeBefore = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            linkedListInt.add(i);
        }
        timeAfter = System.currentTimeMillis();
        System.out.println(timeAfter - timeBefore);
        ///---------------------------------------
        timeBefore = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            arrayListStr.add(i + "");
        }
        timeAfter = System.currentTimeMillis();
        System.out.println(timeAfter - timeBefore);

        timeBefore = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            linkedListStr.add(i + "");
        }
        timeAfter = System.currentTimeMillis();
        System.out.println(timeAfter - timeBefore);
        ///--------------------------------------
        timeBefore = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            arrayListInt.get(i);
        }
        timeAfter = System.currentTimeMillis();
        System.out.println(timeAfter - timeBefore);

        timeBefore = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            linkedListInt.get(i);
        }
        timeAfter = System.currentTimeMillis();
        System.out.println(timeAfter - timeBefore);
        ///--------------------------------------
        timeBefore = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            arrayListStr.get(i);
        }
        timeAfter = System.currentTimeMillis();
        System.out.println(timeAfter - timeBefore);

        timeBefore = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            linkedListStr.get(i);
        }
        timeAfter = System.currentTimeMillis();
        System.out.println(timeAfter - timeBefore);
        ///--------------------------------------
        timeBefore = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            arrayListInt.set(i, 1);
        }
        timeAfter = System.currentTimeMillis();
        System.out.println(timeAfter - timeBefore);

        timeBefore = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            linkedListInt.set(i, 1);
        }
        timeAfter = System.currentTimeMillis();
        System.out.println(timeAfter - timeBefore);
        ///--------------------------------------
        timeBefore = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            arrayListStr.set(i, "");
        }
        timeAfter = System.currentTimeMillis();
        System.out.println(timeAfter - timeBefore);

        timeBefore = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            linkedListStr.set(i, "");
        }
        timeAfter = System.currentTimeMillis();
        System.out.println(timeAfter - timeBefore);
        ///--------------------------------------
        timeBefore = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            arrayListInt.remove(0);
        }
        timeAfter = System.currentTimeMillis();
        System.out.println(timeAfter - timeBefore);

        timeBefore = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            linkedListInt.remove(0);
        }
        timeAfter = System.currentTimeMillis();
        System.out.println(timeAfter - timeBefore);
        ///--------------------------------------
        timeBefore = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            arrayListStr.remove(0);
        }
        timeAfter = System.currentTimeMillis();
        System.out.println(timeAfter - timeBefore);

        timeBefore = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            linkedListStr.remove(0);
        }
        timeAfter = System.currentTimeMillis();
        System.out.println(timeAfter - timeBefore);
        ///--------------------------------------

    }
}

package module5.homeWork;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(1, 200, 5, new Date(1000), "President", "Kiev");
        Room room2 = new Room(1, 200, 5, new Date(100), "President", "Kiev");

        System.out.println(room1.equals(room2));

    }
}

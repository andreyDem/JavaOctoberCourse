package module5.homeWork;

import java.util.Date;

public class BookingComAPI implements API{

    Room[] rooms;

    public BookingComAPI(Room[] rooms) {
        rooms[0] = new Room(1, 100, 1, new Date(100), "President", "Kiev");
        rooms[1] = new Room(2, 100, 1, new Date(150), "President", "Kiev");
        rooms[2] = new Room(3, 200, 2, new Date(0), "President", "Kiev");
        rooms[3] = new Room(4, 200, 2, new Date(100), "President", "Kiev");
        rooms[4] = new Room(5, 300, 3, new Date(500), "President", "Kiev");
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }
}

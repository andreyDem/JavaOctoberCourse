package module5.findRoomsHotelTest;

import java.util.Date;

/**
 * Created by Andrey on 25.11.2016.
 */
public class GoogleAPI extends APIFinder implements API{
    Room[] rooms;

    public GoogleAPI() {
        rooms = new Room[5];
        rooms[0] = new Room(7, 100, 1, new Date(), "Hotel", "Xerson");   // 2
        rooms[1] = new Room(8, 150, 1, new Date(), "Dnipro", "Dnister");
        rooms[2] = new Room(9, 100, 1, new Date(), "Khreshatyk", "Kiev");      // 1
        rooms[3] = new Room(10, 300, 3, new Date(), "Tokio", "Japanese");
        rooms[4] = new Room(11, 800, 4, new Date(), "Cinema", "London");  //3
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return super.findRooms(price, persons, city, hotel);
    }
}

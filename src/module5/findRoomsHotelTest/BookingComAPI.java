package module5.findRoomsHotelTest;

import java.util.Date;

/**
 * Created by Andrey on 25.11.2016.
 */
public class BookingComAPI extends APIFinder implements API {
    Room[] rooms;

    public BookingComAPI() {
        rooms = new Room[5];
        rooms[0] = new Room(1, 100, 1, new Date(), "Khreshatyk", "Kiev");  ///1
        rooms[1] = new Room(2, 150, 1, new Date(), "Chikago", "Ester");     //3
        rooms[2] = new Room(3, 100, 1, new Date(), "Hotel", "Xerson");  //2
        rooms[3] = new Room(4, 300, 3, new Date(), "President", "Kiev");
        rooms[4] = new Room(5, 800, 4, new Date(), "Best", "Odessa");
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
      return super.findRooms(price, persons, city, hotel);
    }
}

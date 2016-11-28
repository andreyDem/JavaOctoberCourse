package module5.findRoomsHotelTest;

import java.util.Date;

/**
 * Created by Andrey on 25.11.2016.
 */
public class TripAdvisorAPI extends APIFinder implements API{
    Room[] rooms;

    public TripAdvisorAPI() {
        rooms = new Room[5];
        rooms[0] = new Room(1, 100, 1, new Date(), "Khreshatyk", "Kiev");
        rooms[1] = new Room(2, 150, 1, new Date(), "Chikago", "Ester"); //1
        rooms[2] = new Room(3, 200, 2, new Date(), "Central", "Lviv");
        rooms[3] = new Room(4, 300, 3, new Date(), "President", "Kiev"); //3
        rooms[4] = new Room(11, 800, 4, new Date(), "Cinema", "London"); //2
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return super.findRooms(price, persons, city, hotel);
    }
}

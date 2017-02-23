package Java1Module.module5.homeWork;

import java.util.Date;

public class BookingComAPI implements API {

    Room[] rooms = new Room[5];

    public BookingComAPI() {
        Room roomSngl = new Room(5, 500, 1, new Date(), "ParkInn", "NY");
        rooms[0] = roomSngl;
        Room roomDbl = new Room(4, 500, 1, new Date(), "Hilton", "Chicago");
        rooms[1] = roomDbl;
        Room roomTwn = new Room(3, 580, 3, new Date(), "MaxHotel", "Florida"); // the same with Google
        rooms[2] = roomTwn;
        Room roomLux = new Room(2, 800, 5, new Date(), "Houston", "Washington");
        rooms[3] = roomLux;
        Room roomLuxery = new Room(1, 1100, 2, new Date(), "MaxHotel", "Amsterdam");// the same with TripAdvisor
        rooms[4] = roomLuxery;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] founded = new Room[5];
        Room request = new Room(0, price, persons, new Date(), hotel, city);
        int index = 0;
        for (Room room : rooms) {
            if (hotel == null) {
                if (room.equals(request)) {
                    founded[index] = room;
                    System.out.println(founded[index]);
                    index++;
                }
            } else {
                if (room.equals(request) && hotel == room.getHotelName()) {
                    founded[index] = room;
                    System.out.println(founded[index]);
                    index++;
                }
            }
        }
        return founded;
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }


}

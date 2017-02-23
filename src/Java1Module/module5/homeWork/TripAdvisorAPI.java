package Java1Module.module5.homeWork;

import java.util.Date;

public class TripAdvisorAPI implements API{
    Room[] rooms= new Room[5];

    public TripAdvisorAPI() {
        Room roomSngl = new Room(10, 999, 3, new Date(), "MaxHotel", "Berlin");
        rooms[0] = roomSngl;
        Room roomDbl = new Room(9, 1300, 5, new Date(), "ParkInn", "Kiev");// the same with Google
        rooms[1] = roomDbl;
        Room roomTwn = new Room(8, 1500, 4, new Date(), "City Hotel", "Paris");
        rooms[2] = roomTwn;
        Room roomLux = new Room(7, 1760, 3, new Date(), "Rosewood", "London");
        rooms[3] = roomLux;
        Room roomLuxery = new Room(6, 1100, 2, new Date(), "MaxHotel", "Amsterdam");// the same with Booking
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

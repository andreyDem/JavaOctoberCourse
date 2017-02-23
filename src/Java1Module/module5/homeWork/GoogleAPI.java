package Java1Module.module5.homeWork;

import java.util.Date;

public class GoogleAPI implements API{
    Room[] rooms= new Room[5];

    public GoogleAPI() {
        Room roomSngl = new Room(15, 160, 4, new Date(), "Amira", "Poltava");
        rooms[0] = roomSngl;
        Room roomDbl = new Room(14, 350, 3, new Date(), "Undor", "Kharkiv");
        rooms[1] = roomDbl;
        Room roomTwn = new Room(13, 580, 3, new Date(), "MaxHotel", "Florida");//the same with Booking
        rooms[2] = roomTwn;
        Room roomLux = new Room(12, 1300, 5, new Date(), "ParkInn", "Kiev");// the same with TripAdvisor
        rooms[3] = roomLux;
        Room roomLuxery = new Room(11, 2100, 3, new Date(), "Hilton", "Kiev");
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

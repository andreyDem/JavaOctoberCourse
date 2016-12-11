package module5.homeWorkWithCollections;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookingComAPI implements API {

    List<Room> booking = new ArrayList<>();

    public BookingComAPI() {
        booking.add(new Room(5, 500, 1, new Date(), "ParkInn", "NY"));
        booking.add(new Room(4, 500, 1, new Date(), "Hilton", "Chicago"));
        booking.add(new Room(3, 580, 3, new Date(), "MaxHotel", "Florida"));
        booking.add(new Room(2, 800, 5, new Date(), "Houston", "Washington"));
        booking.add(new Room(1, 1100, 2, new Date(), "MaxHotel", "Amsterdam"));
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] founded = new Room[5];
        Room request = new Room(0, price, persons, new Date(), hotel, city);
        int index = 0;
        for (Room room : booking) {
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
    public List<Room> getAll() {
        return booking;
    }


}

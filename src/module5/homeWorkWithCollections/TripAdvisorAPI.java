package module5.homeWorkWithCollections;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TripAdvisorAPI implements API{
    List<Room> trip = new ArrayList<>();

    public TripAdvisorAPI() {
        trip.add(new Room(10, 999, 3, new Date(), "MaxHotel", "Berlin"));
        trip.add(new Room(9, 1300, 5, new Date(), "ParkInn", "Kiev"));
        trip.add(new Room(8, 1500, 4, new Date(), "City Hotel", "Paris"));
        trip.add(new Room(7, 1760, 3, new Date(), "Rosewood", "London"));
        trip.add(new Room(6, 1100, 2, new Date(), "MaxHotel", "Amsterdam"));
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] founded = new Room[5];
        Room request = new Room(0, price, persons, new Date(), hotel, city);
        int index = 0;
        for (Room room : trip) {
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
        return trip;
    }
}

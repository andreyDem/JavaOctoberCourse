package Java1Module.module5.homeWorkWithCollections;

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
    public List<Room> findRooms(int price, int persons, String city, String hotel) {
        List<Room> founded = new ArrayList<>();
        for (Room room : getAll()) {
            if (hotel==null){
                if (room.getPrice() == price
                        && room.getPersons() == persons
                        && room.getCityName().equals(city)){
                    founded.add(room);
                    System.out.println(room);
                }
            }else{
                if  (room.getPrice() == price
                        && room.getPersons() == persons
                        && room.getCityName().equals(city)
                        && room.getHotelName().equals(hotel)){
                    founded.add(room);
                    System.out.println(room);
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

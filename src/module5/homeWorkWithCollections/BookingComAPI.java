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
        return booking;
    }


}

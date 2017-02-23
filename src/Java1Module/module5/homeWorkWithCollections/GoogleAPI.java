package Java1Module.module5.homeWorkWithCollections;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoogleAPI implements API {
    List<Room> google = new ArrayList<>();

    public GoogleAPI() {
        google.add(new Room(15, 160, 4, new Date(), "Amira", "Poltava"));
        google.add(new Room(14, 350, 3, new Date(), "Undor", "Kharkiv"));
        google.add(new Room(13, 580, 3, new Date(), "MaxHotel", "Florida"));
        google.add(new Room(12, 1300, 5, new Date(), "ParkInn", "Kiev"));
        google.add(new Room(11, 2100, 3, new Date(), "Hilton", "Kiev"));
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
        return google;
    }
}

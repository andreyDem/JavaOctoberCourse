package module5.homeWorkWithCollections;

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
//    public List<Room> findRooms(int price, int persons, String city, String hotel) {
//        Room[] founded = new Room[5];
//        Room request = new Room(0, price, persons, new Date(), hotel, city);
//        int index = 0;
//        for (Room room : google) {
//            if (hotel == null) {
//                if (room.equals(request)) {
//                    founded[index] = room;
//                    System.out.println(founded[index]);
//                    index++;
//                }
//            } else {
//                if (room.equals(request) && hotel == room.getHotelName()) {
//                    founded[index] = room;
//                    System.out.println(founded[index]);
//                    index++;
//                }
//            }
//        }
//        return google;
//    }
    public List<Room> findRooms(int price, int persons, String city, String hotel) {
        List<Room> founded = new ArrayList<>();
        for (Room room : getAll()) {
            if (room.getPrice() == price
                    && room.getPersons() == persons
                    && room.getCityName().equals(city)
                    && room.getHotelName().equals(hotel)) {
                founded.add(room);
            }
        }
        return founded;
    }

    @Override
    public List<Room> getAll() {
        return google;
    }


}

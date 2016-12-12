package module5.homeWorkWithCollections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {

    List<API> apisArray = new ArrayList<>();
    DAO daoSave = new DAOimpl();

    public Controller() {
        apisArray.add(new BookingComAPI());
        apisArray.add(new GoogleAPI());
        apisArray.add(new TripAdvisorAPI());
    }


//    public Room[] recreateArray(Room[] rooms) {
//        int k = 0;
//        for (Room room : rooms) {
//            if (room != null) k++;
//        }
//        Room[] roomsArray = new Room[k];
//        for (int i = 0; i < k; i++) {
//            roomsArray[i] = rooms[i];
//        }
//        return roomsArray;
//    }

    List<Room> requestRooms(int price, int persons, String city, String hotel) {
//        Room[] result = new Room[15];

//        int index = 0;
//        for (int i = 0; i < 3; i++) {
//            Room[] findRoom = recreateArray(apisArray[i].findRooms(price, persons, city, hotel));
//            for (Room room : findRoom) {
//                result[index] = room;
//                daoSave.save(result[index]);
//                index++;
//            }
//        }
//        return result;
        List<Room> result = new  ArrayList<>();
        for (API api : apisArray) {
            List<Room> findRoom = api.findRooms(price, persons, city, hotel);
            for (Room room : findRoom) {
                result.add(room);
                daoSave.save(room);
            }
        }
        return result;
    }

    List<Room> check(API api1, API api2) {
//        Room[] roomApi1 = api1.getAll();
//        Room[] roomApi2 = api2.getAll();
//        Room[] checkedRooms = new Room[10];
//        for (int i = 0; i < roomApi1.length; i++) {
//            for (int j = 0; j < roomApi2.length; j++) {
//                if (roomApi1[i].equals(roomApi2[j])) {
//                    checkedRooms[i] = roomApi1[i];
//                    System.out.println("The same rooms in " + checkedRooms[i].getHotelName() + " in " + checkedRooms[i].getCityName() + " city.");
//                }
//            }
//        }
//        return recreateArray(checkedRooms);

        List<Room> checkedRooms = new ArrayList<>();

        List<Room> roomApi1 = api1.getAll();
        List<Room> roomApi2 = api2.getAll();
        for (int i = 0; i < roomApi1.size(); i++) {
            for (int j = 0; j < roomApi2.size(); j++) {
                if (roomApi1.get(i).equals(roomApi2.get(j))) {
                    checkedRooms.add(roomApi1.get(i));
                    System.out.println("The same rooms in " + checkedRooms.get(i).getHotelName() + " in " + checkedRooms.get(i).getCityName() + " city.");
                }
            }
        }
        return checkedRooms;
    }


}

package module5.homeWorkWithCollections;


import java.util.Arrays;

public class Controller {

    API[] apisArray = new API[3];

    public Controller() {
        BookingComAPI bookingComAPI = new BookingComAPI();
        apisArray[0] = bookingComAPI;
        GoogleAPI googleAPI = new GoogleAPI();
        apisArray[1] = googleAPI;
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();
        apisArray[2] = tripAdvisorAPI;
    }

    public Controller(API[] apisArray) {
        this.apisArray = apisArray;
    }

    public Room[] recreateArray(Room[] rooms) {
        int k = 0;
        for (Room room : rooms) {
            if (room != null) k++;
        }
        Room[] roomsArray = new Room[k];
        for (int i = 0; i < k; i++) {
            roomsArray[i] = rooms[i];
        }
        return roomsArray;
    }

    Room[] requestRooms(int price, int persons, String city, String hotel) {
        Room[] result = new Room[15];
        DAO daoSave = new DAOimpl();
        int index = 0;
        for (int i = 0; i < 3; i++) {
            Room[] findRoom = recreateArray(apisArray[i].findRooms(price, persons, city, hotel));
            for (Room room : findRoom) {
                result[index] = room;
                daoSave.save(result[index]);
                index++;
            }
        }
        return result;
    }

//    Room[] check(API api1, API api2) {
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
//    }


}

package Java1Module.module5.homeWorkWithCollections;


import java.util.ArrayList;
import java.util.List;

public class Controller {

    List<API> apisArray = new ArrayList<>();

    public Controller() {
        apisArray.add(new BookingComAPI());
        apisArray.add(new GoogleAPI());
        apisArray.add(new TripAdvisorAPI());
    }

    List<Room> requestRooms(int price, int persons, String city, String hotel) {
        List<Room> result = new  ArrayList<>();
        DAO daoSave = new DAOimpl();
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
        List<Room> checkedRooms = new ArrayList<>();
        List<Room> roomApi1 = api1.getAll();
        List<Room> roomApi2 = api2.getAll();
        for (int i = 0; i < roomApi1.size(); i++) {
            for (int j = 0; j < roomApi2.size(); j++) {
                if (roomApi1.get(i).equals(roomApi2.get(j))) {
                    checkedRooms.add(roomApi1.get(i));
                    System.out.println("The same rooms in " + roomApi1.get(i).getHotelName() + " in " + roomApi1.get(i).getCityName() + " city.");
                }
            }
        }
        return checkedRooms;
    }
}

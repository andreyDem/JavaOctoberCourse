package module5.homeWorkWithCollections;


import java.util.List;

public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);

    List<Room> getAll();
}

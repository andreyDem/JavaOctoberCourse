package module5.homeWorkWithCollections;

public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);

    Room[] getAll();
}

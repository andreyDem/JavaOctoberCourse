package module5.findRoomsHotelTest;

/**
 * Created by Andrey on 25.11.2016.
 */
public class APIFinder {
    Room[] rooms;

    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int count = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getPrice() == price && rooms[i].getPersons() == persons &&
                    rooms[i].getCityName().equals(city) && rooms[i].getHotelName().equals(hotel)) {
                count++;
            }
        }
        Room[] room23 = new Room[count];
        count = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getPrice() == price && rooms[i].getPersons() == persons &&
                    rooms[i].getCityName().equals(city) && rooms[i].getHotelName().equals(hotel)) {
                room23[count] = rooms[i];
                count++;
            }
        }
        return room23;
    }
}

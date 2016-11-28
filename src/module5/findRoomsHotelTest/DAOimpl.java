package module5.findRoomsHotelTest;

import java.util.Date;

/**
 * Created by Andrey on 25.11.2016.
 */
public class DAOimpl implements DAO{
    @Override
    public Room save(Room room) {
        System.out.println("Room saved: " + room.toString());
        return null;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println("Room delete: " + room.getId() + " " + room.getHotelName());
        return false;
    }

    @Override
    public Room update(Room room) {
        System.out.println("Room update: " + room.getId() + " " + room.getHotelName());
        return null;
    }

    @Override
    public Room findById(long id) {
        Room room = new Room(id, 100, 1, new Date(), "Chicago", "Ester");
        System.out.println("Room finding: " + room);
        return null;
    }


}

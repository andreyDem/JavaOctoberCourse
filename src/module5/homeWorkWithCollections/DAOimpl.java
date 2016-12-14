package module5.homeWorkWithCollections;

import java.util.Date;

public class DAOimpl implements DAO {


    @Override
    public Room save(Room room) {
        System.out.println(room + " saved succesfull");
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println("Room deleted.ID room - " + room.getId() + ". Hotel - " + room.getHotelName());
        return false;
    }

    @Override
    public Room update(Room room) {
        System.out.println("The room updated.ID room - " + room.getId() + ". Hotel - " + room.getHotelName());
        return null;
    }

    @Override
    public Room findById(long id) {
        Room room = new Room(id, 600, 2, new Date(), "CentralPalace", "Lviv");
        System.out.println("Found room - " + room);
        return null;
    }

    @Override
    public Room[] getAll() {
        return null;
    }


}

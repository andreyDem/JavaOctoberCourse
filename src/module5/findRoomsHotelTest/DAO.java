package module5.findRoomsHotelTest;

/**
 * Created by Andrey on 25.11.2016.
 */
public interface DAO {
    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);
}

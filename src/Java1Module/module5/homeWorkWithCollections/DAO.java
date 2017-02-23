package Java1Module.module5.homeWorkWithCollections;

import java.util.List;

public interface DAO {

    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);
    List<Room> getAll();
}

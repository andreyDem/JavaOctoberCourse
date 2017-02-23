package Java1Module.module5.homeWork;

public interface DAO {

    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);
    Room[] getAll();
}

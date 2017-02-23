package Java1Module.module8.homeWork;

import java.util.ArrayList;
import java.util.List;

public class AbstractDAOImpl<T> implements AbstractDAO<T> {

    private List<T> list = new ArrayList<>();


    @Override
    public T save(T t) {
        System.out.println("Add " + t + " to our list");
        list.add(t);
        return t;
    }

    @Override
    public void delete(T t) {
        if (list.contains(t)) {
            System.out.println("Remove from our list " + t);
            list.remove(t);
        }
        else
        System.out.println("Error, not found " + t);
    }

    @Override
    public void deleteAll(List<T> t) {
        System.out.println("Remove many users form our list ");
        list.removeAll(t);
    }

    @Override
    public void saveAll(List<T> t) {
        System.out.println("Add list of users to our list");
        list.addAll(t);
    }

    @Override
    public List<T> getList() {
        System.out.println("Our list: " + list);
        return list;
    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public T get(long id) {
        return null;
    }

}

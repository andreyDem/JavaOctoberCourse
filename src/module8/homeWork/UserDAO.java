package module8.homeWork;

import java.util.List;

public class UserDAO extends AbstractDAOImpl<User> {
    List<User> users = getList();

    @Override
    public void deleteById(long id) {
        if (get(id)!=null) {
            System.out.println("Remove user " + get(id).getName() + " with id = " + get(id).getId());
            users.remove(get(id));
        }

    }

    @Override
    public User get(long id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        System.out.println("Error, not found user with id = " + id);
        return null;
    }

    @Override
    public String toString() {
        return "UserDAO{" +
                "users=" + users +
                '}';
    }


}

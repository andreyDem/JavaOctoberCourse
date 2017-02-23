package Java1Module.module8;


import Java1Module.module8.homeWork.AbstractDAO;
import Java1Module.module8.homeWork.User;
import Java1Module.module8.homeWork.UserDAO;

import java.util.ArrayList;
import java.util.List;


public class TestHomeWork {
    public static void main(String[] args) {
        User user1 = new User(1, "Andrey");
        User user2 = new User(2, "Pawa");
        User user3 = new User(3, "Olga");
        User user4 = new User(4, "Natawa");
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        User user5 = new User(5, "Gleb");

        AbstractDAO userDAO1 = new UserDAO();
        userDAO1.saveAll(userList);
        userDAO1.getList();
        System.out.println("---------------------------------------------------------------------------------------");
        userDAO1.save(user5);
        userDAO1.getList();
        System.out.println("---------------------------------------------------------------------------------------");
        userDAO1.delete(user3);
        userDAO1.getList();
        System.out.println("---------------------------------------------------------------------------------------");
        userDAO1.deleteAll(userList);
        userDAO1.getList();
        System.out.println("---------------------------------------------------------------------------------------");
        userDAO1.deleteById(6);
        userDAO1.getList();
        System.out.println("---------------------------------------------------------------------------------------");
        userDAO1.deleteById(5);
        userDAO1.getList();
    }
}

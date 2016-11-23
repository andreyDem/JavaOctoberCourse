package module5.homeWork;

import java.util.Arrays;

public class Controller {

    API apis[] = new API[3];

    Room[] requstRooms(int price, int persons, String city, String hotel){
        return new Room[0];
    }

    Room[] check(API api1, API api2){
        return null;
    }

    @Override
    public String toString() {
        return "Controller{" +
                "apis=" + Arrays.toString(apis) +
                '}';
    }
}

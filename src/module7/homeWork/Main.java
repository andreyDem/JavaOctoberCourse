package module7.homeWork;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        User andrey = new User(1, "Andrey", "Demchuk", "Kiev", 50000);
        User vasya = new User(2, "Vasya", "Petrov", "Odessa", 1000);
        User olga = new User(3, "Olga", "Samoilova", "Kiev", 5000);
        User vika = new User(4, "Vika", "Nikiferova", "Kharkov", 3000);
        User stepan = new User(5, "Stepan", "Kasatkin", "Kiev", 6500);
        User petr = new User(6, "Petr", "Petrov", "Kiev", 5050);
        User lena = new User(7, "Lena", "Dywkina", "Lviv", 2500);
        User sveta = new User(8, "Sveta", "Kozadoeva", "Dnepr", 2020);
        User tolik = new User(9, "Tolik", "Fedorov", "Cherkasu", 0);
        User tanya = new User(10, "Tanya", "Svetlova", "Symu", 500);

        ArrayList<Order> orderList = new ArrayList<>();
        orderList.add(new Order(10500, Currency.USD, "smartphone", "123445", andrey));
        orderList.add(new Order(1000, Currency.UAH, "telephone", "4322", vasya));
        orderList.add(new Order(2000, Currency.UAH, "sofa", "44356", olga));
        orderList.add(new Order(3000, Currency.UAH, "PC", "12312", vika));
        orderList.add(new Order(4000, Currency.USD, "table", "65756", stepan));
        orderList.add(new Order(5000, Currency.UAH, "netbook", "276512", petr));
        orderList.add(new Order(2000, Currency.UAH, "TV", "43512", lena));
        orderList.add(new Order(3500, Currency.USD, "monitor", "687532", sveta));
        orderList.add(new Order(100, Currency.UAH, "mouse", "897768", tolik));
        orderList.add(new Order(500, Currency.USD, "printer", "8767", tanya));



//        for (Order order : ArraysUtilsList.sortDecrease(orderList)) {
//            System.out.println(order);
//        }

        for (Order order : ArraysUtilsList.sortIncreaseAndCity(orderList)) {
            System.out.println(order);
        }
    }


}

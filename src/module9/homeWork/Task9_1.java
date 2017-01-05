package module9.homeWork;
import module7.homeWork.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Task9_1 {
    public static void main(String[] args) {
        User andrey = new User(1, "Andrey", "Demchuk", "Kiev", 50000);
        User vasya = new User(2, "Vasya", "Petrov", "Odessa", 1000);
        User olga = new User(3, "Olga", "Samoilova", "Dnepr", 5000);
        User vika = new User(4, "Vika", "Nikiferova", "Kharkov", 3000);
        User stepan = new User(5, "Stepan", "Kasatkin", "Kiev", 6500);
        User petr = new User(6, "Petr", "Petrov", "Lviv", 5050);
        User lena = new User(7, "Lena", "Dywkina", "Adler", 2500);
        User sveta = new User(8, "Sveta", "Kozadoeva", "Dnepr", 2020);
        User tolik = new User(9, "Tolik", "Fedorov", "Cherkasu", 0);
        User tanya = new User(10, "Tanya", "Svetlova", "Symu", 500);

        List<Order> orderList = new ArrayList<>();
        orderList.add(new Order(1, 10500, Currency.USD, "smartphone", "1", andrey));
        orderList.add(new Order(2, 1000, Currency.UAH, "telephone", "4", vasya));
        orderList.add(new Order(3, 2000, Currency.UAH, "sofa", "3", olga));
        orderList.add(new Order(4, 3000, Currency.UAH, "PC", "5", vika));
        orderList.add(new Order(5, 4000, Currency.USD, "table", "2", stepan));
        orderList.add(new Order(6, 5000, Currency.UAH, "netbook", "9", petr));
        orderList.add(new Order(7, 2000, Currency.UAH, "TV", "11", lena));
        orderList.add(new Order(8, 3500, Currency.USD, "monitor", "10", sveta));
        orderList.add(new Order(9, 100, Currency.UAH, "mouse", "12", tolik));
        orderList.add(new Order(10, 500, Currency.USD, "printer", "13", tanya));
        orderList.add(new Order(11, 500, Currency.USD, "printer", "13", tanya));

//        orderList.stream()
//                .filter()



    }
}

package module7.homeWork;

import java.util.*;

public class MainTree {
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

        Set<Order> orderTree = new TreeSet<>((o1, o2) -> {
            if (o1.getPrice() > o2.getPrice()) {
                return 1;
            } else if (o1.getPrice() < o2.getPrice()) {
                return -1;
            } else {
                if (o1.getCurrency().equals(o2.getCurrency()))
                    return 0;
                else if (o1.getCurrency().equals(Currency.USD))
                    return 1;
                else return -1;
            }
        });
        orderTree.add(new Order(1, 10500, Currency.USD, "smartphone", "1", andrey));
        orderTree.add(new Order(2, 1000, Currency.UAH, "telephone", "4", vasya));
        orderTree.add(new Order(3, 2000, Currency.USD, "sofa", "3", olga));
        orderTree.add(new Order(4, 3000, Currency.UAH, "PC", "5", vika));
        orderTree.add(new Order(5, 4000, Currency.USD, "table", "2", stepan));
        orderTree.add(new Order(6, 5000, Currency.UAH, "netbook", "9", petr));
        orderTree.add(new Order(7, 2000, Currency.UAH, "TV", "11", lena));
        orderTree.add(new Order(8, 3500, Currency.USD, "monitor", "10", sveta));
        orderTree.add(new Order(9, 500, Currency.USD, "printer", "13", tanya));
        orderTree.add(new Order(10, 500, Currency.USD, "printer", "13", tanya));

//        for (Order order : orderTree) {
//            System.out.println(order);
//        }

//        TreeUtils.isPetrovHere(orderTree);

//        TreeUtils.maxValuePrice(orderTree);

        TreeUtils.removeUSD(orderTree);
    }
}

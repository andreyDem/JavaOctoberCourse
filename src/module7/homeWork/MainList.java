package module7.homeWork;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainList {
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
        orderList.add(new Order(10500, Currency.USD, "smartphone", "1", andrey));
        orderList.add(new Order(1000, Currency.UAH, "telephone", "4", vasya));
        orderList.add(new Order(2000, Currency.UAH, "sofa", "3", olga));
        orderList.add(new Order(3000, Currency.UAH, "PC", "5", vika));
        orderList.add(new Order(4000, Currency.USD, "table", "2", stepan));
        orderList.add(new Order(5000, Currency.UAH, "netbook", "9", petr));
        orderList.add(new Order(2000, Currency.UAH, "TV", "11", lena));
        orderList.add(new Order(3500, Currency.USD, "monitor", "10", sveta));
        orderList.add(new Order(100, Currency.UAH, "mouse", "12", tolik));
        orderList.add(new Order(500, Currency.USD, "printer", "13", tanya));
        orderList.add(new Order(500, Currency.USD, "printer", "13", tanya));

//        for (Order order : ArraysUtilsList.sortDecrease(orderList)) {
//            System.out.println(order);
//        }
//        for (Order order : ArraysUtilsList.sortIncreaseAndCity(orderList)) {
//            System.out.println(order);
//        }
//        for (Order order : ArraysUtilsList.sortItemIdCity(orderList)) {
//            System.out.println(order);
//        }
//        for (Order order : ArraysUtilsList.deleteDuplicates(orderList)) {
//            System.out.println(order);
//        }
//        for (Order order : ArraysUtilsList.priceLess(orderList)){
//            System.out.println(order);
//        }
//        List<Order>[] separateUsdAndUah = ArraysUtilsList.separateUSDandUAH(orderList);
//        for (List<Order> list : separateUsdAndUah) {
//            System.out.println(list);
//        }
        for (List<Order> list : ArraysUtilsList.uniqueCities(orderList)) {
            System.out.println(list);
        }
    }


}

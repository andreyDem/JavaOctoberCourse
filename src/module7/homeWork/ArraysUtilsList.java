package module7.homeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraysUtilsList {
    public ArraysUtilsList() {
    }

    private static Comparator<Order> sortPrice = (Order a, Order b) -> {
        Integer price1 = a.getPrice();
        Integer price2 = b.getPrice();
        return price1.compareTo(price2);
    };

    private static Comparator<Order> sortCity = (Order a, Order b) -> {
        String city1 = a.getUser().getCity();
        String city2 = b.getUser().getCity();
        return city1.compareTo(city2);
    };

    public static ArrayList<Order> sortDecrease(ArrayList<Order> orders) {
        ArrayList<Order> orders2 = new ArrayList<>();
        Collections.sort(orders, sortPrice);
        for (int i = orders.size() - 1; i >= 0; i--) {
            orders2.add(orders.get(i));
        }
        return orders2;
    }

    public static ArrayList<Order> sortIncreaseAndCity(ArrayList<Order> orders) {
        Collections.sort(orders, sortPrice);
        ArrayList<Order> arrays = new ArrayList<>();
        for (int i = 0; i < orders.size(); i++) {
            for (int j = i+1; j <orders.size() ; j++) {
                if (orders.get(i).getPrice()==orders.get(j).getPrice()){

                }
            }
        }


        return orders;
    }

//    static ArrayList<Order> sortDecrease(ArrayList<Order> orders) {
//        ArrayList<Order> newList = new ArrayList<>();
//        int[] arr = new int[orders.size()];
//        for (int i = 0; i < orders.size(); i++) {
//            arr[i] = orders.get(i).getPrice();
//        }
//        Arrays.sort(arr);
//        for (int i = arr.length-1; i >= 0; i--) {
//            for (int j = 0; j < orders.size(); j++) {
//                if (arr[i] == orders.get(j).getPrice()) {
//                    newList.add(orders.get(j));
//                    orders.remove(j);
//                }
//            }
//        }
//        return newList;
//    }
}

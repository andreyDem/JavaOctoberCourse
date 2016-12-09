package module7.homeWork;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArraysUtilsList {
    public ArraysUtilsList() {
    }

    public static List<Order> sortDecrease(List<Order> orders) {
        Comparator<Order> sortPrice = (Order a, Order b) -> {
            Integer price1 = a.getPrice();
            Integer price2 = b.getPrice();
            return price2.compareTo(price1);
        };
        Collections.sort(orders, sortPrice);
        return orders;
    }

    public static List<Order> sortIncreaseAndCity(List<Order> orders) {
        Comparator<Order> sortIncreaseAndCity = (Order a, Order b) -> {
            Integer price1 = a.getPrice();
            Integer price2 = b.getPrice();
            String city1 = a.getUser().getCity();
            String city2 = b.getUser().getCity();
            if (price1.compareTo(price2) == 0) {
                return city1.compareToIgnoreCase(city2);
            } else
                return price1.compareTo(price2);
        };
        Collections.sort(orders, sortIncreaseAndCity);
        return orders;
    }

    public static List<Order> sortItemIdCity(List<Order> orders) {
        Comparator<Order> sortItemIdCity = (Order a, Order b) -> {
            String item1 = a.getItemName();
            String item2 = b.getItemName();
            String id1 = a.getShopIdentificator();
            String id2 = b.getShopIdentificator();
            String city1 = a.getUser().getCity();
            String city2 = b.getUser().getCity();
            if (item1.compareToIgnoreCase(item2) == 0) {
                if (id1.compareToIgnoreCase(id2) == 0) {
                    return city1.compareToIgnoreCase(city2);
                } else
                    return id1.compareToIgnoreCase(id2);
            } else
                return item1.compareToIgnoreCase(item2);
        };
        Collections.sort(orders, sortItemIdCity);
        return orders;
    }

    public static List<Order> deleteDuplicates(List<Order> orders) {
        for (int i = 0; i < orders.size(); i++) {
            for (int j = i + 1; j < orders.size(); j++) {
                if (orders.get(i).equals(orders.get(j))) {
                    orders.remove(j);
                }
            }
        }
        return orders;
    }

    public static List<Order> priceLess(List<Order> orders) {
        for (int i = 0; i < orders.size(); i++) {
            for (int j = i; j < orders.size(); j++) {
                if (orders.get(j).getPrice() < 1500) {
                    orders.remove(j);
                }
            }
        }
        return orders;
    }

//    public static List<Order>[] separeta

//    static List<Order> sortDecrease(ArrayList<Order> orders) {
//        List<Order> newList = new ArrayList<>();
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

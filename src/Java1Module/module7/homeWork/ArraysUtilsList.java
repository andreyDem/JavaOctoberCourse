package Java1Module.module7.homeWork;


import java.util.*;

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
        System.out.println("Sort list by Order price in decrease order");
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
        System.out.println("Sort list by Order price in increase order AND User city");
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
        System.out.println("Sort list by Order itemName AND ShopIdentificator AND User city");
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
        System.out.println("Delete duplicates from the list");
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
        System.out.println("Delete items where price less than 1500");
        return orders;
    }

    public static List<Order>[] separateUSDandUAH(List<Order> orders) {
        List<Order>[] allOrders = new ArrayList[2];
        List<Order> usdOrders = new ArrayList<>();
        List<Order> uahOrders = new ArrayList<>();
        allOrders[0] = usdOrders;
        allOrders[1] = uahOrders;
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getCurrency().equals(Currency.USD)) {
                usdOrders.add(orders.get(i));
            }
            if (orders.get(i).getCurrency().equals(Currency.UAH)) {
                uahOrders.add(orders.get(i));
            }
        }
        System.out.println("Separate list for two list - orders in USD and UAH");
        return allOrders;
    }

    public static List<Order>[] uniqueCities(List<Order> orders) {
        List<Order>[] allCity = new ArrayList[orders.size()];
        int counter = 0;
        do {
            allCity[counter] = new ArrayList<>();
            allCity[counter].add(orders.get(0));
            for (int i = 1; i < orders.size(); i++) {
                if (allCity[counter].get(0).getUser().getCity().equals(orders.get(i).getUser().getCity())) {
                    allCity[counter].add(orders.get(i));
                }
            }
            for (int i = 0; i < allCity[counter].size(); i++) {
                for (int j = 0; j < orders.size(); j++) {
                    if (allCity[counter].get(i).equals(orders.get(j))) {
                        orders.remove(j);
                    }
                }
            }
            counter++;
        } while (orders.size() > 0);
        System.out.println("Separate list for as many lists as many unique cities are in User");
        return checkNull(allCity);
    }

    //a helper method
    private static List<Order>[] checkNull(List<Order>[] orders) {
        int counter = 0;
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] != null) {
                counter++;
            }
        }
        List<Order>[] uniqueCity = new ArrayList[counter];
        counter = 0;
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] != null) {
                uniqueCity[counter] = orders[i];
                counter++;
            }
        }
        return uniqueCity;
    }

    //works by use arrays to sort list
    static List<Order> sortDecreaseWithArrays(List<Order> orders) {
        List<Order> newList = new ArrayList<>();
        int[] arr = new int[orders.size()];
        for (int i = 0; i < orders.size(); i++) {
            arr[i] = orders.get(i).getPrice();
        }
        Arrays.sort(arr);
        for (int i = arr.length-1; i >= 0; i--) {
            for (int j = 0; j < orders.size(); j++) {
                if (arr[i] == orders.get(j).getPrice()) {
                    newList.add(orders.get(j));
                    orders.remove(j);
                }
            }
        }
        return newList;
    }
}

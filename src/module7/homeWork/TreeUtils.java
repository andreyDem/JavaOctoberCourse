package module7.homeWork;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

public class TreeUtils {
    public TreeUtils() {
    }

    public static void isPetrovHere(Set<Order> orders) {
        Iterator<Order> iterator = orders.iterator();
        boolean isPetrov = false;
        while (iterator.hasNext()) {
            if (iterator.next().getUser().getLastName().equals("Petrov")) {
                isPetrov = true;
            }
        }
        if (isPetrov == true)
            System.out.println("Petrov is here");
        else System.out.println("Petrov is not here");
    }

    public static void maxValuePrice(Set<Order> orders) {
        Iterator<Order> iterator = orders.iterator();
        int[] arr = new int[orders.size()];
        int count = 0;
        while (iterator.hasNext()) {
            arr[count] = iterator.next().getPrice();
            count++;
        }
        Arrays.sort(arr);
        System.out.println("Max value of price: " + arr[arr.length-1]);
    }

    public static void removeUSD(Set<Order> orders){
        Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext()){
            if (iterator.next().getCurrency().equals(Currency.USD)){
               iterator.remove();
            }
        }
        for (Order order : orders) {
            System.out.println(order);
        }
    }

}

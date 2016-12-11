package module7.homeWork;

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
}

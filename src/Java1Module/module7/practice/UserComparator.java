package Java1Module.module7.practice;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
     if (o1.getName().compareTo(o2.getName()) == 0){
         return o1.getLastName().compareTo(o2.getLastName());
     }
     return o1.getName().compareTo(o2.getName());
    }
}

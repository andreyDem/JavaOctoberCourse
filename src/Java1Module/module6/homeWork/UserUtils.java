package Java1Module.module6.homeWork;

public final class UserUtils {
    private UserUtils() {
    }

    public static User[] uniqueUsers(User[] users) {
        User[] newUser = users.clone();
        for (int i = 0; i < users.length; i++) {
            for (int j = i+1; j < users.length; j++) {
                if (newUser[i] != null && newUser[i].equals(users[j]))
                  newUser[i] = null;
            }
        }
        return deleteEmptyUsers(newUser);
    }

    //users are equal when all their field are equal
    public static User[] usersWithConditionalBalance(User[] users, int balance) {
        int count = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i]!=null && users[i].getBalance() == balance) {
                count++;
            }
        }
        User[] condUser = new User[count];
        count = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i]!=null && users[i].getBalance() == balance) {
                condUser[count] = users[i];
                count++;
            }
        }
        return condUser;
    }

    //user’s balance == balance
    public static final User[] paySalaryToUsers(User[] users) {
        for (int i = 0; i < users.length; i++) {
            if (users[i]!=null)
            users[i].setBalance(users[i].getBalance() + users[i].getSalary());
        }
        return users;
    }

    public static final long[] getUsersId(User[] users) {
        long[] idUsers = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            if (users[i]==null)
                continue;
            else
            idUsers[i] = users[i].getId();
        }
        return idUsers;
    }

    public static User[] deleteEmptyUsers(User[] users) {
        int count = 0;
        for (User user : users) {
            if (user != null)
                count++;
        }
        User[] clearUsers = new User[count];
        count = 0;
        for (int i = 0; i <users.length ; i++) {
            if (users[i]!=null){
                clearUsers[count] = users[i];
                count++;
            }else continue;
        }
        return clearUsers;
    }
}

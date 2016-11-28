package module5.practice;

public class Main {
    public static void main(String[] args) {
        buisenessCreation();
        adminUserCreation();


    }

    private static void adminUserCreation() {
        User petya = new User(2, "Petya");
        petya.setConnection(Connection.getInstance());
    }

    private static void buisenessCreation() {
        User vasya = new User(1, "Vasya");
        vasya.setConnection(Connection.getInstance());
    }
}

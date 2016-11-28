package module5.practice;

public class User {
    int id;
    String name;
    static Connection connection;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static Connection getConnection() {

        return connection;
    }

    public static void setConnection(Connection connection) {
        System.out.println(connection);
        User.connection = connection;
    }
}

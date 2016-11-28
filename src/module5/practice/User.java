package module5.practice;

public class User {
    int id;
    String name;
    static Connection connection;

    public User(int id, String name, Connection connection) {
        this.id = id;
        this.name = name;
        this.connection = connection;
    }

    public static Connection getConnection(){

        return connection;
    }

}

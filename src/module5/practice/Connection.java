package module5.practice;

public class Connection {
    private String url = "some url";
    private static Connection instance = new Connection();

    public static Connection getInstance() {

        return instance;
    }

}

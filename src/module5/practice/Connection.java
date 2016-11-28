package module5.practice;

public class Connection {
    private String url = "some url";
    private static Connection instance;

    public static Connection getInstance() {
        if (instance == null){
            instance = new Connection();
        }
        return instance;
    }

}

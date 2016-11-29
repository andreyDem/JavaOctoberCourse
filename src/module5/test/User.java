package module5.test;

/**
 * Created by Andrey on 28.11.2016.
 */
public class User {
    String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}

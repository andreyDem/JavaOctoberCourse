package independentWork.car;


public class Car {
    private String color;
    private String mark;
    private String model;
    private char category;
    User user;
    Engine model1 = new Engine(120, 130);

    public Car(String color, String mark, String model, char category, User user) {
        this.color = color;
        this.mark = mark;
        this.model = model;
        this.category = category;
        this.user = user;

    }

    public Car(Engine model1) {
        this.model1 = model1;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public char getCategory() {
        return category;
    }

    public void setCategory(char category) {
        this.category = category;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Engine getModel1() {
        return model1;
    }

    public void setModel1(Engine model1) {
        this.model1 = model1;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", category=" + category +
                ", user=" + user +
                ", model1=" + model1 +
                '}';
    }
}

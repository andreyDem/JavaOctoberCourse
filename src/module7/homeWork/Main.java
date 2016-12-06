package module7.homeWork;

public class Main {
    public static void main(String[] args) {
        User andrey = new User(1, "Andrey", "Demchuk", "Kiev", 50000);
        User vasya = new User(2, "Vasya", "Petrov", "Odessa", 1000);
        User olga = new User(3, "Olga", "Samoilova", "Kiev", 5000);
        User vika = new User(4, "Vika", "Nikiferova", "Kharkov", 3000);
        User stepan = new User(5, "Stepan", "Kasatkin", "Kiev", 6500);
        User petr = new User(6, "Petr", "Petrov", "Kiev", 5050);
        User lena = new User(7, "Lena", "Dywkina", "Lviv", 2500);
        User sveta = new User(8, "Sveta", "Kozadoeva", "Dnepr", 2020);
        User tolik = new User(9, "Tolik", "Fedorov", "Cherkasu", 0);
        User tanya = new User(10, "Tanya", "Svetlova", "Symu", 500);

        Order order1 = new Order(10500, Currency.UAH, "smartphone", "123445", andrey);
        Order order2 = new Order(1000, Currency.UAH, "telephone", "4322", vasya);
        Order order3 = new Order(2000, Currency.UAH, "sofa", "44356", olga);
        Order order4 = new Order(3000, Currency.UAH, "PC", "12312", vika);
        Order order5 = new Order(4000, Currency.UAH, "table", "65756", stepan);
        Order order6 = new Order(5000, Currency.UAH, "netbook", "276512", petr);
        Order order7 = new Order(2000, Currency.UAH, "TV", "43512", lena);
        Order order8 = new Order(3500, Currency.UAH, "monitor", "687532", sveta);
        Order order9 = new Order(100, Currency.UAH, "mouse", "897768", tolik);
        Order order10 = new Order(500, Currency.UAH, "printer", "8767", tanya);

        

    }
}

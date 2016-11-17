package module4.homeWork.task4_5;

import module4.homeWork.task4_1.Bank;
import module4.homeWork.task4_2.Currency;
import module4.homeWork.task4_3.ChinaBank;
import module4.homeWork.task4_4.User;

public class Main {
    public static void main(String[] args) {

        Bank bank1 = new ChinaBank(321432, "Pekin", Currency.EUR, 20, 333, 32112, 43543123);
        Bank bank2 = new ChinaBank(876432, "Sian", Currency.USD, 30, 111, 43534, 6454131);

        User user1 = new User(321432213, "Petrov", 7000.50, 10,"Luxoft", 3000, bank1);
        User user2 = new User(7652533, "Semen", 15050.80, 25,"Epam", 3200, bank2);

        System.out.println(user1.toString());
    }
}

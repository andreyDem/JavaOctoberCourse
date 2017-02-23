package Java1Module.module4.homeWork.task4_5;

import Java1Module.module4.homeWork.task4_1.Bank;
import Java1Module.module4.homeWork.task4_2.Currency;
import Java1Module.module4.homeWork.task4_3.ChinaBank;
import Java1Module.module4.homeWork.task4_3.EUBank;
import Java1Module.module4.homeWork.task4_3.USBank;
import Java1Module.module4.homeWork.task4_4.User;
import Java1Module.module4.homeWork.task4_6.BankSystem;
import Java1Module.module4.homeWork.task4_6.BankSystemImpl;

public class Main {
    public static void main(String[] args) {

        Bank pekinBank = new ChinaBank(321432, "Pekin", Currency.EUR, 20, 100, 32112, 43543123);
        Bank sianBank = new ChinaBank(876432, "Sian", Currency.USD, 30, 250, 43534, 6454131);
        Bank parisBank = new EUBank(4453, "Paris", Currency.EUR, 100, 3000, 123231, 1245324512);
        Bank berlinBank = new EUBank(434525, "Berlin", Currency.USD, 50, 4000, 543, 54453512);
        Bank chicagoBank = new USBank(6453, "Chicago", Currency.EUR, 21, 500, 45331, 534512);
        Bank newYorkBank = new USBank(23412, "NewYork", Currency.USD, 132, 2000, 13224, 322513232);

        User user1 = new User(1, "Petrov", 7000.50, 10, "Luxoft", 3000, pekinBank);
        User user2 = new User(2, "Semen", 15050.80, 25, "Epam", 3200, sianBank);
        User user3 = new User(3, "Olga", 50, 2, "WG", 700, parisBank);
        User user4 = new User(4, "Anna", 12320.33, 33, "InfoPulse", 4000, berlinBank);
        User user5 = new User(5, "Stanislav", 50000, 12, "SoftServe", 5500, chicagoBank);
        User user6 = new User(6, "Andrey", 1333.30, 7, "GlobalLogic", 1200, newYorkBank);

        User[] users = {user1, user2, user3, user4, user5, user6};
        for (User number : users) {
            System.out.println(number);
        }

        BankSystem system = new BankSystemImpl();
        system.fundUser(user1, 100);
        System.out.println("user1Balance= " + user1.getBalance());
        system.paySalary(user2);
        System.out.println("user2Balance= " +user2.getBalance());
        system.withdrawOfUser(user1, 2000);
        System.out.println("user1Balance= " +user1.getBalance());
        system.transferMoney(user2, user3, 5000);
        System.out.println("user2Balance= " + user2.getBalance() + " user3Balance= " +
                user3.getBalance());
        system.fundUser(user4, 20000);
        System.out.println("user1Balance= " + user4.getBalance());
    }
}

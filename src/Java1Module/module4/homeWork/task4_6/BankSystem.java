package Java1Module.module4.homeWork.task4_6;

import Java1Module.module4.homeWork.task4_4.User;

public interface BankSystem {
    void withdrawOfUser(User user, int amount);
    void fundUser(User user, int amount);
    void transferMoney(User fromUser, User toUser, int amount);
    void paySalary(User user);
}

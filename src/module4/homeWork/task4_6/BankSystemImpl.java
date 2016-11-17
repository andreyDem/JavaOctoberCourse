package module4.homeWork.task4_6;

import module4.homeWork.task4_4.User;


public class BankSystemImpl implements BankSystem{

    @Override
    public void withdrawOfUser(User user, int amount) {
        if (user.getBalance() - user.getBank().getCommission(amount) > 0);
    }

    @Override
    public void fundUser(User user, int amount) {

    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {

    }

    @Override
    public void paySalary(User user) {

    }
}

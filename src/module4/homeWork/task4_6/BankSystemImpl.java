package module4.homeWork.task4_6;

import module4.homeWork.task4_4.User;


public class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount) {
        double comission = (amount * user.getBank().getCommission(amount) / 100);
        if (user.getBalance() - amount - comission >= 0)
            user.setBalance(user.getBalance() - amount - comission);
        else
            System.out.println("Not enough money on your balance: " + user.getBalance());
    }

    @Override
    public void fundUser(User user, int amount) {
        user.setBalance(user.getBalance() + amount);
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        if (fromUser.getBank().getCurrency().equals(toUser.getBank().getCurrency())) {
            if (fromUser.getBalance() >= amount) {
                fromUser.setBalance(fromUser.getBalance() - amount);
                toUser.setBalance(toUser.getBalance() + amount);
            } else
                System.out.println("Your amount: " + amount + " is bigger than your balance: " + fromUser.getBalance());
        }
        if (!fromUser.getBank().getCurrency().equals(toUser.getBank().getCurrency()))
            System.out.println("Balance is not in the same currency");
    }

    @Override
    public void paySalary(User user) {
        user.setBalance(user.getBalance() + user.getSalary());
    }
}


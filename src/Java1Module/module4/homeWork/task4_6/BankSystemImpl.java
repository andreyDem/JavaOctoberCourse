package Java1Module.module4.homeWork.task4_6;

import Java1Module.module4.homeWork.task4_4.User;


public class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount) {
        double comission = (amount * user.getBank().getCommission(amount) / 100);
        if (amount <= user.getBank().getLimitOfWithdrawal()) {
            if (user.getBalance() - amount - comission >= 0)
                user.setBalance(user.getBalance() - amount - comission);
            else
                System.out.println("Not enough money on your balance: " + user.getBalance());
        } else
            System.out.println("Your amount: " + amount +
                    " is bigger than your withdrawal limit: " + user.getBank().getLimitOfWithdrawal());
    }

    @Override
    public void fundUser(User user, int amount) {
        if (amount <= user.getBank().getLimitOfFunding())
            user.setBalance(user.getBalance() + amount);
        else
            System.out.println("Error, your limit of funding: " + user.getBank().getLimitOfFunding() + "" +
                    " and your now fund is: " + amount);
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


package module4.homeWork.task4_3;

import module4.homeWork.task4_1.Bank;
import module4.homeWork.task4_2.Currency;

public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    protected int getLimitOfWithdrawal() {
        int value = 0;

        if (getCurrency().equals(Currency.USD))
            value = 100;
        if (getCurrency().equals(Currency.EUR))
            value = 150;
        return value;
    }

    @Override
    protected int getLimitOfFunding() {
        int value = 0;

        if (getCurrency().equals(Currency.USD))
            value = 10000;
        if (getCurrency().equals(Currency.EUR))
            value = 5000;
        return value;
    }

    @Override
    protected int getMonthlyRate() {
        int value = 0;

        if (getCurrency().equals(Currency.USD))
            value = 1;
        if (getCurrency().equals(Currency.EUR))
            value = 0;
        return value;
    }

    @Override
    protected int getCommission(int summ) {
        int value = 0;

        if (getCurrency().equals(Currency.USD)) {
            if (summ <= 1000)
                value = 3;
            else
                value = 5;
        }
        if (getCurrency().equals(Currency.EUR)) {
            if (summ <= 1000)
                value = 10;
            else
                value = 11;
        }
        return value;
    }


}

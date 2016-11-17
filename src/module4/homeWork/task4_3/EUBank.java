package module4.homeWork.task4_3;

import module4.homeWork.task4_1.Bank;
import module4.homeWork.task4_2.Currency;

public class EUBank extends Bank{
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    protected int getLimitOfWithdrawal() {
        int value = 0;

        if (getCurrency().equals(Currency.USD))
            value = 2000;
        if (getCurrency().equals(Currency.EUR))
            value = 2200;
        return value;
    }

    @Override
    protected int getLimitOfFunding() {
        int value = 0;

        if (getCurrency().equals(Currency.USD))
            value = 10000;
        if (getCurrency().equals(Currency.EUR))
            value = 20000;
        return value;
    }

    @Override
    protected int getMonthlyRate() {
        int value = 0;

        if (getCurrency().equals(Currency.USD))
            value = 0;
        if (getCurrency().equals(Currency.EUR))
            value = 1;
        return value;
    }

    @Override
    protected int getCommission(int summ) {
        int value = 0;

        if (getCurrency().equals(Currency.USD)) {
            if (summ <= 1000)
                value = 5;
            else
                value = 7;
        }
        if (getCurrency().equals(Currency.EUR)) {
            if (summ <= 1000)
                value = 2;
            else
                value = 4;
        }
        return value;
    }

}
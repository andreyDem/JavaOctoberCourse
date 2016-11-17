package module4.homeWork.task4_3;

import module4.homeWork.task4_1.Bank;
import module4.homeWork.task4_2.Currency;

public class USBank extends Bank{

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        int value = 0;

        if (getCurrency().equals(Currency.USD))
            value = 1000;
        if (getCurrency().equals(Currency.EUR))
            value = 1200;
        return value;
    }

    @Override
    public int getLimitOfFunding() {
        int value = 0;

        if (getCurrency().equals(Currency.USD))
            value = Integer.MAX_VALUE;
        if (getCurrency().equals(Currency.EUR))
            value = 10000;
        return value;
    }

    @Override
    public int getMonthlyRate() {
        int value = 0;

        if (getCurrency().equals(Currency.USD))
            value = 1;
        if (getCurrency().equals(Currency.EUR))
            value = 2;
        return value;
    }

    @Override
    public int getCommission(int summ) {
        int value = 0;

        if (getCurrency().equals(Currency.USD)) {
            if (summ <= 1000)
                value = 5;
            else
                value = 7;
        }
        if (getCurrency().equals(Currency.EUR)) {
            if (summ <= 1000)
                value = 6;
            else
                value = 8;
        }
        return value;
    }

}

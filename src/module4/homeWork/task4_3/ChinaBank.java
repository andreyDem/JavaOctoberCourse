package module4.homeWork.task4_3;

import module4.homeWork.task4_1.Bank;
import module4.homeWork.task4_2.Currency;

public class ChinaBank extends Bank{

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    protected int getLimitOfWithdrawal() {
        return 0;
    }

    @Override
    protected int getLimitOfFunding() {
        return 0;
    }

    @Override
    protected int getMonthlyRate() {
        return 0;
    }

    @Override
    protected int getCommission(int summ) {
        return 0;
    }

}

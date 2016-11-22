package module4.practice.daoTest;


import java.util.Arrays;

public class RusMonthDAO implements MonthDAO {

    //private String[] strings = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY"};

    private String[] Rus = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь",
            "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};

    @Override
    public boolean addWord(String word) {
        Rus = Arrays.copyOf(Rus, Rus.length+1);
        Rus[Rus.length-1] = word;
        return true;
    }

    @Override
    public boolean updateWord(String src, String dest) {
        return false;
    }

    @Override
    public boolean deleteWord(String wordToDelete) {
        return false;
    }

    @Override
    public String[] getList() {
        return new String[0];
    }
}

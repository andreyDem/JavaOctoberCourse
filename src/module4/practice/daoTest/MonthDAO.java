package module4.practice.daoTest;

public interface MonthDAO {

    boolean addWord(String word);

    boolean updateWord(String src, String dest);

    boolean deleteWord(String wordToDelete);

    String[] getList();


}

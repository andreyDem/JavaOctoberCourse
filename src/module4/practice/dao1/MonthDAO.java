package module4.practice.dao1;

public interface MonthDAO {

    boolean addWord(String word);

    boolean updateWord(String src, String dest);

    boolean deleteWord(String wordToDelete);

    String[] getList();


}

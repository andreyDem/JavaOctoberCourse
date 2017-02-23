package Java1Module.module4.practice.DAO;

public interface MonthDAO {

  boolean addWord(String word);
  boolean updateWord(String src, String dest);
  boolean delete(String wordToDelete);
  String[] getList();

}
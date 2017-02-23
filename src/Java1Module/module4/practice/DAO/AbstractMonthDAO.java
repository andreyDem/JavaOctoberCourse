package Java1Module.module4.practice.DAO;

import java.util.Arrays;

public abstract class AbstractMonthDAO implements MonthDAO {

  abstract String[] getArray();
  abstract String[] setArray(String[] array);

  @Override
  public boolean addWord(String word) {
    setArray(Arrays.copyOf(getArray(), getArray().length + 1));
    getArray()[getArray().length - 1] = word;

    return true;
  }


  @Override
  public boolean updateWord(String src, String dest) {
    boolean isUpdated = false;

    for (int i = 0; i < getArray().length ; i++) {
      String month = getArray()[i];

      if (src.equals(month)) {
        getArray()[i] = dest;
        isUpdated = true;
      }
    }

    return isUpdated;
  }

  @Override
  public boolean delete(String wordToDelete) {
    boolean isUpdated = false;

    for (int i = 0; i < getArray().length ; i++) {
      String month = getArray()[i];

      if (wordToDelete.equals(month)) {
        getArray()[i] = null;
        isUpdated = true;
      }
    }

    return isUpdated;
  }

  public String[] getList() {
    return getArray();
  }
}
package module4.practice.DAO;

public class RusMonthDAO extends AbstractMonthDAO {

  String[] arrayRus =  {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август"};

  @Override
  String[] getArray() {
    return arrayRus;
  }

  @Override
  String[] setArray(String[] array) {
    return arrayRus = array;
  }

//    @Override
//    public boolean addWord(String word) {
//
//        arrayRus =  Arrays.copyOf(arrayRus, arrayRus.length + 1);
//        arrayRus[arrayRus.length - 1] = word;
//
//        return true;
//    }


}
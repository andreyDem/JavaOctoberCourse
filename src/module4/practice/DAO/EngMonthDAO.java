package module4.practice.DAO;

public class EngMonthDAO extends AbstractMonthDAO {

  String[] arrayEng =  {"January", "February", "March", "April", "May", "June", "July", "August"};

  @Override
  String[] getArray() {
    return arrayEng;
  }

  @Override
  String[] setArray(String[] array) {
    return arrayEng = array;
  }

//    @Override
//    public boolean addWord(String word) {
//
//        arrayEng =  Arrays.copyOf(arrayEng, arrayEng.length + 1);
//        arrayEng[arrayEng.length - 1] = word;
//
//        return true;
//    }


}
package Java1Module.module4.practice.DAO;

public class UkrMonthDAO extends AbstractMonthDAO {


  String[] arrayUkr =  {"Січень", "Лютий", "Березень", "Квітень", "Травень"};

  @Override
  String[] getArray() {
    return arrayUkr;
  }

  @Override
  String[] setArray(String[] array) {
    return arrayUkr = array;
  }
}
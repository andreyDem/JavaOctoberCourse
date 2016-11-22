package module4.practice.DAO;

import java.util.Arrays;

/**
 * Created by citsym on 21.11.16.
 */
public class ServiceLogic {
  public static void main(String[] args) {
    MonthDAO monthDAO;

    String user = "ukrainian";
    String monthToAdd = null;
    String monthUpdateSrc = null;
    String monthUpdateDest = null;

    switch (user) {
      case "american":
        monthDAO = getEngMonthDao();
        monthToAdd = "October";
        monthUpdateDest = "December";
        break;
      case "russian":
        monthDAO = getRusMonthDao();
        monthToAdd = "Октябрь";
        monthUpdateDest = "Декабрь";
        break;
      case "ukrainian":
        monthDAO = getUkrMonthDao();
        monthToAdd = "Жовтень";
        monthUpdateDest = "Грудень";
        break;
      default:
        monthDAO = getRusMonthDao();
        monthToAdd = "Октябрь";
        monthUpdateDest = "Декабрь";
        break;
    }

    monthUpdateSrc = monthToAdd;

    String[] monthArray =  monthDAO.getList();

    sendMonthesToClient(monthArray);

    monthDAO.addWord(monthToAdd);

    String[] monthArrayAfterAdd =  monthDAO.getList();

    sendMonthesToClient(monthArrayAfterAdd);

    System.out.println("Update is " +monthDAO.updateWord(monthUpdateSrc, monthUpdateDest));

    String[] monthArrayAfterUpdate =  monthDAO.getList();

    sendMonthesToClient(monthArrayAfterUpdate);

    System.out.println("Delete is " + monthDAO.delete(monthUpdateDest));

    String[] monthArrayAfterDelete =  monthDAO.getList();

    sendMonthesToClient(monthArrayAfterDelete);

  }

  private static void sendMonthesToClient(String[] monthArray) {
    System.out.println(Arrays.toString(monthArray));
  }

  private static MonthDAO getUkrMonthDao() {
    return new UkrMonthDAO();
  }

  private static MonthDAO getEngMonthDao() {
    return new EngMonthDAO();
  }

  private static MonthDAO getRusMonthDao() {
    return new RusMonthDAO();
  }
}
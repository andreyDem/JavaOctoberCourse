package module4.practice.dao1;


import java.util.Arrays;

public class ServerLogic {
    public static void main(String[] args) {
        MonthDAO monthDAO;
        String user = "russian";

        if (user.equals("american"))
            monthDAO = getEngMonthDao();
        else if (user.equals("russian"))
            monthDAO = getRusMonthDao();
        else if (user.equals("ukranian"))
            monthDAO = getUkrMonthDao();
        else
            monthDAO = getAnotherMonthDao();
        String[] monthArray = monthDAO.getList();

        sendMonthesToClient(monthDAO);
    }

    private static void sendMonthesToClient(MonthDAO monthDAO) {
        System.out.println(Arrays.toString(monthDAO.getList()));
    }

    private static MonthDAO getAnotherMonthDao() {
        return null;
    }

    private static MonthDAO getUkrMonthDao() {
        return null;
    }

    private static MonthDAO getRusMonthDao() {
        return new RusMonthDAO();
    }


    private static MonthDAO getEngMonthDao() {
        return null;
    }


}



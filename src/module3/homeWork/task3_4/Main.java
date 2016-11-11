package module3.homeWork.task3_4;

public class Main {
    public static void main(String[] args) {
        User user = new User("Anrey", 2000, 9, "AlfaBank", 5000, "grn");

        user.paySalary();
        System.out.println(user.getBalance());
        System.out.println(user.withdraw(1000));
        System.out.println(user.companyNameLength());
        user.monthIncreaser(2);
        System.out.println(user.getMonthsOfEmployment());
        

    }
}

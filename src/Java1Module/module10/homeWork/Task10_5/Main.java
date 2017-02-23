package Java1Module.module10.homeWork.Task10_5;

public class Main {
    public static void main(String[] args) {
        Task10_5 test = new Task10_5();
        try {
            test.throwThreeExc(1);
            test.throwThreeExc(2);
            test.throwThreeExc(3);
        }catch (Exception e){
            System.out.println("catch " + e);
        }
    }
}

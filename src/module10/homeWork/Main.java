package module10.homeWork;

public class Main {
    public static void main(String[] args) {

        /// Task10_2
        System.out.println("Task10_2");
        try {
            Task10_2 message = new Task10_2("some message");
            message.printString();
        }catch (Task10_2 e){
            System.out.println("catch 1");
        }catch (RuntimeException e){
            System.out.println("catch here, if pass upline");
        }

        ////Task10_3
        System.out.println();
        System.out.println("Task10_3");

        try {
            Task10_2 one = null;
            one.printString();
        }catch (NullPointerException e){
            System.out.println("catch 1 " + e);
        }catch (Task10_2 e){
            System.out.println("catch 2 " + e);
        }catch (RuntimeException e){
            System.out.println("catch 3 " + e);
        } catch (Exception e){
            System.out.println("catch 4 " + e);
        }

        ///Task10_4
        System.out.println();
        System.out.println("Task10_4");

        Task10_4 two = new Task10_4();
        try {
            two.f();
        }catch (Exception e){
            System.out.println("catched in main");
        }
    }
}

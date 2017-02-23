package Java1Module.module10.homeWork;

public class Task10_1 {
    public static void main(String[] args) throws Exception {
        try {
            throw new Exception("\"something\"");
        } catch (Exception e) {
            System.out.println("Catch our exception and print " + e.getMessage());
        } finally {
            System.out.println("finally working...");
        }
    }
}

package Java1Module.module10;

public class Test {
    public static void main(String[] args) {
        try {
//            throw new Test();
        } catch (IndexOutOfBoundsException e){
            System.out.println(6);
        }   catch (Exception e){
            System.out.println(7);
        }
    }
}

package module10.homeWork;

public class Task10_4 {
    public void g(){
        throw new Task10_2("exception 1");
    }

    public void f(){
        try {
            g();
        }catch (Task10_2 e){
            System.out.println("catch in runtime");
            throw new RuntimeException();
        }catch (Exception e){
            System.out.println("catch in upline");
        }
    }
}

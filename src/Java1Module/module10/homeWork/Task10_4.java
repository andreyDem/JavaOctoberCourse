package Java1Module.module10.homeWork;

import Java1Module.module10.homeWork.Task10_5.SecondExcept;

public class Task10_4 {
    public void g(){
        throw new Task10_2("exception 1");
    }

    public void f(){
        try {
            g();

        }catch (Task10_2 e){
            System.out.println("catch in runtime");
            throw new SecondExcept();
        }catch (Exception e){
            System.out.println("catch in upline");
        }
    }
}

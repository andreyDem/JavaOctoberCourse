package Java1Module.module6.practice;

public class Triangle extends View{
     int counter = 0;
    @Override
   public void show() {
        if (counter<1){
            System.out.println("Triangle show");
        }else
            System.out.println("Triangle cant shown");
    }

    @Override
   public void hide() {
        if (counter==0) {
            System.out.println("Triangle hide");
            counter++;
        }else
            System.out.println("Nothing to hide");
    }
}

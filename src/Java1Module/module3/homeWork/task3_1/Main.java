package Java1Module.module3.homeWork.task3_1;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.setBirdAction("walking");
        bird.sing();
        bird.setBirdAction("flying");
        bird.sing();
        bird.setBirdAction("singing");
        bird.sing();
        bird.setBirdAction("Bird");
        bird.sing();
    }
}

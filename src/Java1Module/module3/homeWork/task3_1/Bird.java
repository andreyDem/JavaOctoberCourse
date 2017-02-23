package Java1Module.module3.homeWork.task3_1;

public class Bird {
    private String birdAction = "";


    void sing() {
        System.out.println("I am " + birdAction);
    }

    public String getBirdAction() {
        return birdAction;
    }

    public void setBirdAction(String birdAction) {
        this.birdAction = birdAction;
    }
}

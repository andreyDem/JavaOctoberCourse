package module10.homeWork;

public class Task10_2 extends RuntimeException {
    protected String string;

    public Task10_2(String string) {
        this.string = string;
    }

    public void printString() {
        System.out.println(string);
    }


}

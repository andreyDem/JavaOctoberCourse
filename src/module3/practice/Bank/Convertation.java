package module3.practice.Bank;

public class Convertation {
    private double course;

    public Convertation(double course) {
        this.course = course;
    }

    public double convertToDol(int grvn){
        return grvn * course;
    }

}

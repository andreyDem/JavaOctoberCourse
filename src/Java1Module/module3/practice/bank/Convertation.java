package Java1Module.module3.practice.bank;

public class Convertation {
    private double course;

    public Convertation(double course) {
        this.course = course;
    }

    public double convertToDol(double grvn){
        return grvn / course;
    }

}

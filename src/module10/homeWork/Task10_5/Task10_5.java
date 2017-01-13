package module10.homeWork.Task10_5;


public class Task10_5 {


    public void throwThreeExc(int number) throws ThirdExept, SecondExcept, FirstExcept{
        switch (number) {
            case 1:
                throw new FirstExcept();
            case 2:
                throw new SecondExcept();
            default:
                throw new ThirdExept();
        }


    }
}

package independentWork.testStream;


//Условие: дана коллекция класс People (с полями name — имя, age — возраст, sex — пол),
//        вида Arrays.asList( new People(«Вася», 16, Sex.MAN), new People(«Петя», 23, Sex.MAN),
//        new People(«Елена», 42, Sex.WOMEN), new People(«Иван Иванович», 69, Sex.MAN)).
//        Давайте посмотрим примеры как работать с таким классом:

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Collection<People> peoples = Arrays.asList(new People("Вася", 16, Sex.MAN),
                new People("Петя", 23, Sex.MAN), new People("Елена", 42, Sex.WOMEN),
                new People("Иван Иванович", 69, Sex.MAN));


        peoples.stream().filter((p) -> p.getAge()>=18 && p.getAge()<27
                && p.getSex()==Sex.MAN).collect(Collectors.toList());

        peoples.stream().filter((p) -> p.getSex() == Sex.MAN).
                mapToInt(People::getAge).average().getAsDouble();

        peoples.stream().filter((p) -> p.getAge() >= 18).filter(
                (p) -> (p.getSex() == Sex.WOMEN && p.getAge() < 55)
                        || (p.getSex() == Sex.MAN && p.getAge() < 60)).count();
    }
}

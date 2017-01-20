package module11.practice;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PracticeTask {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        List<Double> doubleList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();


//        try {
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//            System.out.println(br.readLine());
//        }catch (IOException e){
//            e.printStackTrace();
//        }

        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    integerList.add(scanner.nextInt());
                    scanner.nextLine();
                } else if (scanner.hasNextDouble()) {
                    doubleList.add(scanner.nextDouble());
                    scanner.nextLine();
                } else{
                    stringList.add(scanner.next());
                    scanner.nextLine();
                }

                integerList.forEach(System.out::println);
                doubleList.forEach(System.out::println);
                stringList.forEach(System.out::println);
            }
        }


    }


}

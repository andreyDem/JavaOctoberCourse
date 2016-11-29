package module5.practice.practiceHome;

import java.util.Scanner;

import static module5.practice.practiceHome.RemoveTheExtraLetters.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String str = scanner.nextLine();
        System.out.println("Enter char");
        String ch = scanner.nextLine();
        char charA = ch.charAt(0);

//        System.out.println(changeUseToCharArray(str, charA));
//        System.out.println(changeUseReplace(str, charA));
//        System.out.println(changeUseSplit(str, charA));
//        System.out.println(changeUseCharAt(str, charA));
//        System.out.println(changeUseSubstring(str, charA));

        System.out.println(change(str, charA));


    }

}

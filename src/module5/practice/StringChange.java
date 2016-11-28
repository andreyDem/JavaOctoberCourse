package module5.practice;

import java.util.Scanner;

public class StringChange {
    static public String string = "wqerrgte";

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
        System.out.println(changeString(string, 'r'));



    }

    public static String changeString(String str, char a){
        String newStr = "";
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i]!=a)
                newStr = newStr + chars[i];
            else
                continue;
        }
        return newStr;
    }


}
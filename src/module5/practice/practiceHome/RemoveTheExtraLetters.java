package module5.practice.practiceHome;

public class RemoveTheExtraLetters {

    public static String changeUseToCharArray(String str, char a) {
        String newStr = "";
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != a)
                newStr = newStr + chars[i];
            else
                continue;
        }
        return newStr;
    }

    public static String changeUseReplace(String str, char a) {
        String newStr = "";
        newStr = str.replace(a + "", "");
        return newStr;
    }

    public static String changeUseSplit(String str, char a) {
        String newStr = "";
        String[] strings = str.split(a + "");
        for (String string : strings) {
            newStr = newStr + string;
        }
        return newStr;
    }

    public static String changeUseCharAt(String str, char a) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != a) {
                newStr = newStr + str.charAt(i);
            } else continue;
        }
        return newStr;
    }

    public static String changeUseSubstring(String str, char a) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i+1).equals(a + ""))
                continue;
            else newStr = newStr + str.substring(i, i+1);
        }
        return newStr;
    }
}
package module11.homeWork;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Task11_1 {
    public static void main(String[] args) {
        System.out.println(fileToString());
        System.out.println("=======================================");
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("one", "1");
        stringMap.put("two", "2");
        stringMap.put("three", "3");
        System.out.println((replacer(stringMap)));

    }

    public static String replacer(Map<String, String> map) {
        String newString = fileToString();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            newString = newString.replaceAll(entry.getKey(), entry.getValue());
        }
        return newString;
    }

    public static String fileToString() {
        File file = addStringInFile();
        String fileToString = "";
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
                new FileInputStream(file)))) {
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                fileToString = fileToString + str + System.lineSeparator();
            }
            fileToString = fileToString.trim();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileToString;
    }

    public static File createNewFile() {
        File file = new File("D:\\JAVA\\TestIO\\TestInput.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }

    public static File addStringInFile() {
        File file = createNewFile();
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            bufferedWriter.write("Andrey try something write ... one" + "\n");
            bufferedWriter.write("Andrey try something write ... two" + "\n");
            bufferedWriter.write("Andrey try something write ... three" + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }


}
